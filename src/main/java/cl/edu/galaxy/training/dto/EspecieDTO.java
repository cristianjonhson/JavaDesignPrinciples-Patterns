package cl.edu.galaxy.training.dto;

import java.util.List;

public class EspecieDTO {

    private Long id;
    private String nombre;
    private List<Long> razas;
    

    // Constructor vacío
    public EspecieDTO() {}

    // Constructor con parámetros
    public EspecieDTO(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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

	public List<Long> getRazas() {
		return razas;
	}

	public void setRazas(List<Long> razas) {
		this.razas = razas;
	}

    
}

