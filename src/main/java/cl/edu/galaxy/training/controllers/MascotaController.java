package cl.edu.galaxy.training.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import cl.edu.galaxy.training.controllers.commons.Constants;
import cl.edu.galaxy.training.entity.Mascota;
import cl.edu.galaxy.training.service.MascotaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(Constants.API_MASCOTAS)
public class MascotaController {

    @Autowired
    private MascotaService mascotaService;

    @GetMapping
    public List<Mascota> getAllMascotas() {
        return mascotaService.findAll();
    }

    @GetMapping(Constants.PATH_ID)
    public ResponseEntity<Mascota> getMascotaById(@PathVariable Long id) {
        Optional<Mascota> mascota = mascotaService.findById(id);
        return mascota.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Mascota createMascota(@RequestBody Mascota mascota) {
        return mascotaService.save(mascota);
    }

    @PutMapping(Constants.PATH_ID)
    public ResponseEntity<Mascota> updateMascota(@PathVariable Long id, @RequestBody Mascota mascota) {
        if (mascotaService.findById(id).isPresent()) {
            mascota.setId(id);
            return ResponseEntity.ok(mascotaService.save(mascota));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(Constants.PATH_ID)
    public ResponseEntity<Void> deleteMascota(@PathVariable Long id) {
        if (mascotaService.findById(id).isPresent()) {
            mascotaService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

