package cl.edu.galaxy.training.dto;

public class CitaTipoNotaDTO {

    private Long idCita; // Referencia a la cita
    private Long idTipoNota; // Referencia al tipo de nota

    // Constructor vacío
    public CitaTipoNotaDTO() {}

    // Constructor con parámetros
    public CitaTipoNotaDTO(Long idCita, Long idTipoNota) {
        this.idCita = idCita;
        this.idTipoNota = idTipoNota;
    }

	public Long getIdCita() {
		return idCita;
	}

	public void setIdCita(Long idCita) {
		this.idCita = idCita;
	}

	public Long getIdTipoNota() {
		return idTipoNota;
	}

	public void setIdTipoNota(Long idTipoNota) {
		this.idTipoNota = idTipoNota;
	}

    
}

