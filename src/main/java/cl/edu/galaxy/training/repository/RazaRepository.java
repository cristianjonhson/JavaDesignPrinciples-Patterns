package cl.edu.galaxy.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.edu.galaxy.training.entity.Raza;

@Repository
public interface RazaRepository extends JpaRepository<Raza, Long> {
    // Puedes agregar métodos personalizados aquí si es necesario
}
