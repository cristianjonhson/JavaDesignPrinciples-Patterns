package cl.edu.galaxy.training.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import cl.edu.galaxy.training.controllers.commons.Constants;
import cl.edu.galaxy.training.entity.Raza;
import cl.edu.galaxy.training.service.RazaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(Constants.API_RAZAS)
public class RazaController {

    @Autowired
    private RazaService razaService;

    @GetMapping
    public List<Raza> getAllRazas() {
        return razaService.findAll();
    }

    @GetMapping(Constants.PATH_ID)
    public ResponseEntity<Raza> getRazaById(@PathVariable Long id) {
        Optional<Raza> raza = razaService.findById(id);
        return raza.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Raza createRaza(@RequestBody Raza raza) {
        return razaService.save(raza);
    }

    @PutMapping(Constants.PATH_ID)
    public ResponseEntity<Raza> updateRaza(@PathVariable Long id, @RequestBody Raza raza) {
        if (razaService.findById(id).isPresent()) {
            raza.setId(id);
            return ResponseEntity.ok(razaService.save(raza));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(Constants.PATH_ID)
    public ResponseEntity<Void> deleteRaza(@PathVariable Long id) {
        if (razaService.findById(id).isPresent()) {
            razaService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

