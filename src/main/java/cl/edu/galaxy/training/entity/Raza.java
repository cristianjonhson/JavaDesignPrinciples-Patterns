package cl.edu.galaxy.training.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_razas")
public class Raza {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, unique = true)
	private String nombre;

	@ManyToOne
	@JoinColumn(name = "id_especie", nullable = false)
	private Especie especie;

	public Raza(Long id, String nombre, Especie especie) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.especie = especie;
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

	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}
	
	

}
