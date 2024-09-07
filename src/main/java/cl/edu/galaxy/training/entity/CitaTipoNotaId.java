package cl.edu.galaxy.training.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CitaTipoNotaId implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idCita;
    private Long idTipoNota;

    public CitaTipoNotaId() {}

    public CitaTipoNotaId(Long idCita, Long idTipoNota) {
        this.idCita = idCita;
        this.idTipoNota = idTipoNota;
    }

    // hashCode y equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CitaTipoNotaId that = (CitaTipoNotaId) o;
        return Objects.equals(idCita, that.idCita) && Objects.equals(idTipoNota, that.idTipoNota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCita, idTipoNota);
    }
}
