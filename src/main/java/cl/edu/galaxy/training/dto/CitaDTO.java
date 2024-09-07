package cl.edu.galaxy.training.dto;

import java.time.LocalDateTime;

public class CitaDTO {

    private Long id;
    private Long idMascota; // Referencia a la mascota
    private Long idVeterinario; // Referencia al veterinario
    private LocalDateTime fechaHora;
    private String notas;
    private String estado;

    // Constructor vacío
    public CitaDTO() {}

    // Constructor con parámetros
    public CitaDTO(Long id, Long idMascota, Long idVeterinario, LocalDateTime fechaHora, String notas, String estado) {
        this.id = id;
        this.idMascota = idMascota;
        this.idVeterinario = idVeterinario;
        this.fechaHora = fechaHora;
        this.notas = notas;
        this.estado = estado;
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

	public Long getIdVeterinario() {
		return idVeterinario;
	}

	public void setIdVeterinario(Long idVeterinario) {
		this.idVeterinario = idVeterinario;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

    
}
