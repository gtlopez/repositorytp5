package fi.unju.edu.ar.tp5.util;

import java.util.ArrayList;

import fi.unju.edu.ar.tp5.model.Docente;

public class ListaDocentes {
private ArrayList<Docente> listDocente;
	
	public ListaDocentes() {
		listDocente = new ArrayList<Docente>();
		Docente unDocente= new Docente(001,"Nombre_Docente_01","Apellido_Docente_01","docente_01@gmail.com","3885000111");
		Docente unDocente02= new Docente(002,"Nombre_Docente_02","Apellido_Docente_02","docente_02@hotmail.com","3884000222");
		Docente unDocente03= new Docente(003,"Nombre_Docente_03","Apellido_Docente_03","docente_03@yahoo.com","3886000333");
		listDocente.add(unDocente);
		listDocente.add(unDocente02);
		listDocente.add(unDocente03);
	}

	public ArrayList<Docente> getListDocente() {
		return listDocente;
	}

	public void setListDocente(ArrayList<Docente> listDocente) {
		this.listDocente = listDocente;
	}

}
