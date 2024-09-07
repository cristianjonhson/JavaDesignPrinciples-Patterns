package cl.edu.galaxy.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.edu.galaxy.training.entity.Cita;
import cl.edu.galaxy.training.repository.CitaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CitaService {

    @Autowired
    private CitaRepository citaRepository;

    public List<Cita> findAll() {
        return citaRepository.findAll();
    }

    public Optional<Cita> findById(Long id) {
        return citaRepository.findById(id);
    }

    public Cita save(Cita cita) {
        return citaRepository.save(cita);
    }

    public void deleteById(Long id) {
        citaRepository.deleteById(id);
    }
}

