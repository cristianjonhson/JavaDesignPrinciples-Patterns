package cl.edu.galaxy.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.edu.galaxy.training.entity.Especie;
import cl.edu.galaxy.training.repository.EspecieRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EspecieService {

    @Autowired
    private EspecieRepository especieRepository;

    public List<Especie> findAll() {
        return especieRepository.findAll();
    }

    public Optional<Especie> findById(Long id) {
        return especieRepository.findById(id);
    }

    public Especie save(Especie especie) {
        return especieRepository.save(especie);
    }

    public void deleteById(Long id) {
        especieRepository.deleteById(id);
    }
}

