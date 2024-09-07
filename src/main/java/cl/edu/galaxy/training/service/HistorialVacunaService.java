package cl.edu.galaxy.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.edu.galaxy.training.entity.HistorialVacuna;
import cl.edu.galaxy.training.repository.HistorialVacunaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class HistorialVacunaService {

    @Autowired
    private HistorialVacunaRepository historialVacunaRepository;

    public List<HistorialVacuna> findAll() {
        return historialVacunaRepository.findAll();
    }

    public Optional<HistorialVacuna> findById(Long id) {
        return historialVacunaRepository.findById(id);
    }

    public HistorialVacuna save(HistorialVacuna historialVacuna) {
        return historialVacunaRepository.save(historialVacuna);
    }

    public void deleteById(Long id) {
        historialVacunaRepository.deleteById(id);
    }
}

