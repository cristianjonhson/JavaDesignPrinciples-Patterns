package cl.edu.galaxy.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.edu.galaxy.training.entity.Mascota;
import cl.edu.galaxy.training.repository.MascotaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MascotaService {

    @Autowired
    private MascotaRepository mascotaRepository;

    public List<Mascota> findAll() {
        return mascotaRepository.findAll();
    }

    public Optional<Mascota> findById(Long id) {
        return mascotaRepository.findById(id);
    }

    public Mascota save(Mascota mascota) {
        return mascotaRepository.save(mascota);
    }

    public void deleteById(Long id) {
        mascotaRepository.deleteById(id);
    }
}
