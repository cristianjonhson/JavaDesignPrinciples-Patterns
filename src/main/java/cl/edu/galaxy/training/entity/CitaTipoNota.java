package cl.edu.galaxy.training.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_citas_tipos_notas")
public class CitaTipoNota {

    @EmbeddedId
    private CitaTipoNotaId id;

    @ManyToOne
    @MapsId("idCita")
    @JoinColumn(name = "id_cita")
    private Cita cita;

    @ManyToOne
    @MapsId("idTipoNota")
    @JoinColumn(name = "id_tipo_nota")
    private TipoNota tipoNota;

	public CitaTipoNota(CitaTipoNotaId id, Cita cita, TipoNota tipoNota) {
		super();
		this.id = id;
		this.cita = cita;
		this.tipoNota = tipoNota;
	}

	public CitaTipoNotaId getId() {
		return id;
	}

	public void setId(CitaTipoNotaId id) {
		this.id = id;
	}

	public Cita getCita() {
		return cita;
	}

	public void setCita(Cita cita) {
		this.cita = cita;
	}

	public TipoNota getTipoNota() {
		return tipoNota;
	}

	public void setTipoNota(TipoNota tipoNota) {
		this.tipoNota = tipoNota;
	}

    
}

