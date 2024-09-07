package cl.edu.galaxy.training.dto;

public class VeterinarioDTO {

    private Long id;
    private String nombre;
    private String telefono;
    private String email;

    // Constructor vacío
    public VeterinarioDTO() {}

    // Constructor con parámetros
    public VeterinarioDTO(Long id, String nombre, String telefono, String email) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

    
}
