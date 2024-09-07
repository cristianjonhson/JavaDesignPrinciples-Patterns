package cl.edu.galaxy.training.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import cl.edu.galaxy.training.controllers.commons.Constants;
import cl.edu.galaxy.training.entity.Vacuna;
import cl.edu.galaxy.training.service.VacunaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(Constants.API_VACUNAS)
public class VacunaController {

    @Autowired
    private VacunaService vacunaService;

    @GetMapping
    public List<Vacuna> getAllVacunas() {
        return vacunaService.findAll();
    }

    @GetMapping(Constants.PATH_ID)
    public ResponseEntity<Vacuna> getVacunaById(@PathVariable Long id) {
        Optional<Vacuna> vacuna = vacunaService.findById(id);
        return vacuna.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Vacuna createVacuna(@RequestBody Vacuna vacuna) {
        return vacunaService.save(vacuna);
    }

    @PutMapping(Constants.PATH_ID)
    public ResponseEntity<Vacuna> updateVacuna(@PathVariable Long id, @RequestBody Vacuna vacuna) {
        if (vacunaService.findById(id).isPresent()) {
            vacuna.setId(id);
            return ResponseEntity.ok(vacunaService.save(vacuna));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(Constants.PATH_ID)
    public ResponseEntity<Void> deleteVacuna(@PathVariable Long id) {
        if (vacunaService.findById(id).isPresent()) {
            vacunaService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
