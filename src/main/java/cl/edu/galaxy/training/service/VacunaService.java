package cl.edu.galaxy.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.edu.galaxy.training.entity.Vacuna;
import cl.edu.galaxy.training.repository.VacunaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class VacunaService {

    @Autowired
    private VacunaRepository vacunaRepository;

    public List<Vacuna> findAll() {
        return vacunaRepository.findAll();
    }

    public Optional<Vacuna> findById(Long id) {
        return vacunaRepository.findById(id);
    }

    public Vacuna save(Vacuna vacuna) {
        return vacunaRepository.save(vacuna);
    }

    public void deleteById(Long id) {
        vacunaRepository.deleteById(id);
    }
}

