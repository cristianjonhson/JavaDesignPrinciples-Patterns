package cl.edu.galaxy.training.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.edu.galaxy.training.entity.Especie;
import cl.edu.galaxy.training.service.EspecieService;


import cl.edu.galaxy.training.controllers.commons.Constants;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(Constants.API_ESPECIES)
public class EspecieController {

    @Autowired
    private EspecieService especieService;

    @GetMapping
    public List<Especie> getAllEspecies() {
        return especieService.findAll();
    }

    @GetMapping(Constants.PATH_ID)
    public ResponseEntity<Especie> getEspecieById(@PathVariable Long id) {
        Optional<Especie> especie = especieService.findById(id);
        return especie.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Especie createEspecie(@RequestBody Especie especie) {
        return especieService.save(especie);
    }

    @PutMapping(Constants.PATH_ID)
    public ResponseEntity<Especie> updateEspecie(@PathVariable Long id, @RequestBody Especie especie) {
        if (especieService.findById(id).isPresent()) {
            especie.setId(id);
            return ResponseEntity.ok(especieService.save(especie));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(Constants.PATH_ID)
    public ResponseEntity<Void> deleteEspecie(@PathVariable Long id) {
        if (especieService.findById(id).isPresent()) {
            especieService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

