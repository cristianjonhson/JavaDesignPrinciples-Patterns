package cl.edu.galaxy.training.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
@Entity
@Table(name = "tbl_mascotas")
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_raza", nullable = true)
    private Raza raza;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "fecha_registro", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime fechaRegistro;

    @OneToMany(mappedBy = "mascota", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Cita> citas;

	public Mascota(Long id, String nombre, Raza raza, LocalDate fechaNacimiento, LocalDateTime fechaRegistro,
			List<Cita> citas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.raza = raza;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaRegistro = fechaRegistro;
		this.citas = citas;
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

	public Raza getRaza() {
		return raza;
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public LocalDateTime getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(LocalDateTime fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public List<Cita> getCitas() {
		return citas;
	}

	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}
  }
