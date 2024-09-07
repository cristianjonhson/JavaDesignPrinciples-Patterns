package cl.edu.galaxy.training.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import cl.edu.galaxy.training.controllers.commons.Constants;
import cl.edu.galaxy.training.entity.Veterinario;
import cl.edu.galaxy.training.service.VeterinarioService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(Constants.API_VETERINARIOS)
public class VeterinarioController {

    @Autowired
    private VeterinarioService veterinarioService;

    @GetMapping
    public List<Veterinario> getAllVeterinarios() {
        return veterinarioService.findAll();
    }

    @GetMapping(Constants.PATH_ID)
    public ResponseEntity<Veterinario> getVeterinarioById(@PathVariable Long id) {
        Optional<Veterinario> veterinario = veterinarioService.findById(id);
        return veterinario.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Veterinario createVeterinario(@RequestBody Veterinario veterinario) {
        return veterinarioService.save(veterinario);
    }

    @PutMapping(Constants.PATH_ID)
    public ResponseEntity<Veterinario> updateVeterinario(@PathVariable Long id, @RequestBody Veterinario veterinario) {
        if (veterinarioService.findById(id).isPresent()) {
            veterinario.setId(id);
            return ResponseEntity.ok(veterinarioService.save(veterinario));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(Constants.PATH_ID)
    public ResponseEntity<Void> deleteVeterinario(@PathVariable Long id) {
        if (veterinarioService.findById(id).isPresent()) {
            veterinarioService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

