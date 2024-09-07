package cl.edu.galaxy.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.edu.galaxy.training.entity.TipoNota;
import cl.edu.galaxy.training.repository.TipoNotaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TipoNotaService {

    @Autowired
    private TipoNotaRepository tipoNotaRepository;

    public List<TipoNota> findAll() {
        return tipoNotaRepository.findAll();
    }

    public Optional<TipoNota> findById(Long id) {
        return tipoNotaRepository.findById(id);
    }

    public TipoNota save(TipoNota tipoNota) {
        return tipoNotaRepository.save(tipoNota);
    }

    public void deleteById(Long id) {
        tipoNotaRepository.deleteById(id);
    }
}

