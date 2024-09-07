package cl.edu.galaxy.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.edu.galaxy.training.entity.Raza;
import cl.edu.galaxy.training.repository.RazaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RazaService {

    @Autowired
    private RazaRepository razaRepository;

    public List<Raza> findAll() {
        return razaRepository.findAll();
    }

    public Optional<Raza> findById(Long id) {
        return razaRepository.findById(id);
    }

    public Raza save(Raza raza) {
        return razaRepository.save(raza);
    }

    public void deleteById(Long id) {
        razaRepository.deleteById(id);
    }
}
