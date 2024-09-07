package cl.edu.galaxy.training.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_tipos_notas")
public class TipoNota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String tipo;

	public TipoNota(Long id, String tipo) {
		super();
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

