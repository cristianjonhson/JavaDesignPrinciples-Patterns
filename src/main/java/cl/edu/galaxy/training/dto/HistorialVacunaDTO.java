package cl.edu.galaxy.training.dto;

import java.time.LocalDate;

public class HistorialVacunaDTO {

    private Long id;
    private Long idMascota; // Referencia a la mascota
    private Long idVacuna;  // Referencia a la vacuna
    private LocalDate fechaAplicacion;
    private String notas;

    // Constructor vacío
    public HistorialVacunaDTO() {}

    // Constructor con parámetros
    public HistorialVacunaDTO(Long id, Long idMascota, Long idVacuna, LocalDate fechaAplicacion, String notas) {
        this.id = id;
        this.idMascota = idMascota;
        this.idVacuna = idVacuna;
        this.fechaAplicacion = fechaAplicacion;
        this.notas = notas;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(Long idMascota) {
		this.idMascota = idMascota;
	}

	public Long getIdVacuna() {
		return idVacuna;
	}

	public void setIdVacuna(Long idVacuna) {
		this.idVacuna = idVacuna;
	}

	public LocalDate getFechaAplicacion() {
		return fechaAplicacion;
	}

	public void setFechaAplicacion(LocalDate fechaAplicacion) {
		this.fechaAplicacion = fechaAplicacion;
	}

	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}


}
