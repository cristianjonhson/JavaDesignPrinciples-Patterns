package cl.edu.galaxy.training.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbl_especies")
public class Especie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nombre;

    @OneToMany(mappedBy = "especie", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Raza> razas;
    
    

	public Especie(Long id, String nombre, List<Raza> razas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.razas = razas;
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

	public List<Raza> getRazas() {
		return razas;
	}

	public void setRazas(List<Raza> razas) {
		this.razas = razas;
	}

   
}

