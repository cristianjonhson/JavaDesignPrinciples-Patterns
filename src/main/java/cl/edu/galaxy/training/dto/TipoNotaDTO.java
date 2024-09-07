package cl.edu.galaxy.training.dto;

public class TipoNotaDTO {

    private Long id;
    private String tipo;

    // Constructor vacío
    public TipoNotaDTO() {}

    // Constructor con parámetros
    public TipoNotaDTO(Long id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

   
}

