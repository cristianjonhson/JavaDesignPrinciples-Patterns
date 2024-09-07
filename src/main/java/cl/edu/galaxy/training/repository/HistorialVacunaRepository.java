package cl.edu.galaxy.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.edu.galaxy.training.entity.HistorialVacuna;

@Repository
public interface HistorialVacunaRepository extends JpaRepository<HistorialVacuna, Long> {
    // Puedes agregar métodos personalizados aquí si es necesario
}

