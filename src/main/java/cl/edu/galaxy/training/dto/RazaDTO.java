package cl.edu.galaxy.training.dto;

public class RazaDTO {

    private Long id;
    private String nombre;
    private Long idEspecie; // Referencia a la especie

    // Constructor vacío
    public RazaDTO() {}

    // Constructor con parámetros
    public RazaDTO(Long id, String nombre, Long idEspecie) {
        this.id = id;
        this.nombre = nombre;
        this.idEspecie = idEspecie;
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

	public Long getIdEspecie() {
		return idEspecie;
	}

	public void setIdEspecie(Long idEspecie) {
		this.idEspecie = idEspecie;
	}

  
}

