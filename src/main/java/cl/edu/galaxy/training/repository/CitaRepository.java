package cl.edu.galaxy.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.edu.galaxy.training.entity.Cita;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Long> {
    // Puedes agregar métodos personalizados aquí si es necesario
}
