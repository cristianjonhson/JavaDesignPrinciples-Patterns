package cl.edu.galaxy.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.edu.galaxy.training.entity.Veterinario;
import cl.edu.galaxy.training.repository.VeterinarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class VeterinarioService {

    @Autowired
    private VeterinarioRepository veterinarioRepository;

    public List<Veterinario> findAll() {
        return veterinarioRepository.findAll();
    }

    public Optional<Veterinario> findById(Long id) {
        return veterinarioRepository.findById(id);
    }

    public Veterinario save(Veterinario veterinario) {
        return veterinarioRepository.save(veterinario);
    }

    public void deleteById(Long id) {
        veterinarioRepository.deleteById(id);
    }
}

