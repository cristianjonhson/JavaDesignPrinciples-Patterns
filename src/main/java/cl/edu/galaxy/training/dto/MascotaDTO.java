package cl.edu.galaxy.training.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MascotaDTO {

    private Long id;
    private String nombre;
    private Long idRaza; // Referencia a la raza
    private LocalDate fechaNacimiento;
    private LocalDateTime fechaRegistro;

    // Constructor vacío
    public MascotaDTO() {}

    // Constructor con parámetros
    public MascotaDTO(Long id, String nombre, Long idRaza, LocalDate fechaNacimiento, LocalDateTime fechaRegistro) {
        this.id = id;
        this.nombre = nombre;
        this.idRaza = idRaza;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaRegistro = fechaRegistro;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getIdRaza() {
		return idRaza;
	}

	public void setIdRaza(Long idRaza) {
		this.idRaza = idRaza;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public LocalDateTime getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(LocalDateTime fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
}
