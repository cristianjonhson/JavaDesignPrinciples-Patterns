package cl.edu.galaxy.training.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tbl_historial_vacunas")
public class HistorialVacuna {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_mascota", nullable = false)
    private Mascota mascota;

    @ManyToOne
    @JoinColumn(name = "id_vacuna", nullable = true)
    private Vacuna vacuna;

    @Column(name = "fecha_aplicacion")
    private LocalDate fechaAplicacion;

    @Column
    private String notas;

	public HistorialVacuna(Long id, Mascota mascota, Vacuna vacuna, LocalDate fechaAplicacion, String notas) {
		super();
		this.id = id;
		this.mascota = mascota;
		this.vacuna = vacuna;
		this.fechaAplicacion = fechaAplicacion;
		this.notas = notas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Mascota getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	public Vacuna getVacuna() {
		return vacuna;
	}

	public void setVacuna(Vacuna vacuna) {
		this.vacuna = vacuna;
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
