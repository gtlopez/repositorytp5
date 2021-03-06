package fi.unju.edu.ar.tp5.model;

import java.time.LocalDate;

import fi.unju.edu.ar.tp5.model.Curso;

public class Beca {
	private int codigo;
	private Curso curso;
	private LocalDate fechaInicio;
	private LocalDate fechaCierre;
	private boolean estado;
	
	public Beca() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Beca(int codigo, Curso curso, LocalDate fechaInicio, LocalDate fechaCierre, boolean estado) {
		super();
		this.codigo = codigo;
		this.curso = curso;
		this.fechaInicio = fechaInicio;
		this.fechaCierre = fechaCierre;
		this.estado = estado;
	}


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaCierre() {
		return fechaCierre;
	}

	public void setFechaCierre(LocalDate fechaCierre) {
		this.fechaCierre = fechaCierre;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	
}