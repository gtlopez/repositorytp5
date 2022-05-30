package fi.unju.edu.ar.tp5.util;

import java.time.LocalDate;
import java.util.ArrayList;

import fi.unju.edu.ar.tp5.model.Curso;

public class ListaCursos {
	private ArrayList<Curso> listCurso;
	//private ListaDocentes listaDocentes;
	ListaDocentes listaDocentes = new ListaDocentes();
	
	public ListaCursos() {
		listCurso = new ArrayList<Curso>(); 
		
		Curso unCurso01 = new Curso(100, "Curso Titulo 100","Basico", LocalDate.of(2022, 4, 1), LocalDate.of(2022,8,25), 150,"Virtual", listaDocentes.getListDocente().get(0));
		Curso unCurso02 = new Curso(200, "Curso Titulo 200","Basico", LocalDate.of(2022, 4, 1), LocalDate.of(2022,8,1), 100,"Virtual", listaDocentes.getListDocente().get(1));
		Curso unCurso03 = new Curso(300, "Curso Titulo 300","Basico", LocalDate.of(2022, 5, 1), LocalDate.of(2022,9,1), 150,"Virtual", listaDocentes.getListDocente().get(2));
		
		listCurso.add(unCurso01);
		listCurso.add(unCurso02);
		listCurso.add(unCurso03);
	}

	public ArrayList<Curso> getListCurso() {
		return listCurso;
	}

	public void setListCurso(ArrayList<Curso> listCurso) {
		this.listCurso = listCurso;
	}

	/*public ListaDocentes getListaDocentes() {
		return listaDocentes;
	}

	public void setListaDocentes(ListaDocentes listaDocentes) {
		this.listaDocentes = listaDocentes;
	}
	
	
*/
}
