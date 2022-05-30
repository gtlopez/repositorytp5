package fi.unju.edu.ar.tp5.util;

import java.util.ArrayList;

import fi.unju.edu.ar.tp5.model.Alumno;



public class ListaAlumnos {
	private ArrayList<Alumno> listAlumno;
	
	public ListaAlumnos() {
		listAlumno = new ArrayList<Alumno>();
		Alumno unAlumno01 = new Alumno(32513528,"AlumnoNombre01","AlumnoApellido01", "emailAlumno01@gmail.com", "3881222111" );
		Alumno unAlumno02 = new Alumno(36005489,"AlumnoNombre02","AlumnoApellido02", "emailAlumno02@gmail.com", "38841268222" );
		Alumno unAlumno03 = new Alumno(29056179,"AlumnoNombre03","AlumnoApellido03", "emailAlumno03@gmail.com", "3886497333" );
		listAlumno.add(unAlumno01);
		listAlumno.add(unAlumno02);
		listAlumno.add(unAlumno03);
	}

	public ArrayList<Alumno> getListAlumno() {
		return listAlumno;
	}

	public void setListAlumno(ArrayList<Alumno> listAlumno) {
		this.listAlumno = listAlumno;
	}

}
