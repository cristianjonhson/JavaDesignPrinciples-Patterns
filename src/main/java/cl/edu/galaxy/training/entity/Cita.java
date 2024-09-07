package cl.edu.galaxy.training.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_citas")
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_mascota", nullable = false)
    private Mascota mascota;

    @ManyToOne
    @JoinColumn(name = "id_veterinario", nullable = true)
    private Veterinario veterinario;

    @Column(name = "fecha_hora", nullable = false)
    private LocalDateTime fechaHora;

    @Column
    private String notas;

    @Column
    private String estado;

	public Cita(Long id, Mascota mascota, Veterinario veterinario, LocalDateTime fechaHora, String notas,
			String estado) {
		super();
		this.id = id;
		this.mascota = mascota;
		this.veterinario = veterinario;
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

	public Mascota getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	public Veterinario getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
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