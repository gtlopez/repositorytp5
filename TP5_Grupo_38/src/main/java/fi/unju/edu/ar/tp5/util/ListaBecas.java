package fi.unju.edu.ar.tp5.util;

import java.time.LocalDate;
import java.util.ArrayList;

import fi.unju.edu.ar.tp5.model.Beca;
import fi.unju.edu.ar.tp5.model.Curso;

public class ListaBecas {
	private ArrayList<Beca> listBeca;
	ListaCursos listaCursos = new ListaCursos();

	
	public ListaBecas() {
		listBeca = new ArrayList<Beca>();
		Beca unaBeca01 = new Beca(001, listaCursos.getListCurso().get(0),LocalDate.of(2022, 3, 29) , LocalDate.of(2022,8,1), true);
		Beca unaBeca02 = new Beca(002, listaCursos.getListCurso().get(1),LocalDate.of(2022, 3, 25) , LocalDate.of(2022,10,15), true);
		Beca unaBeca03 = new Beca(003, listaCursos.getListCurso().get(2),LocalDate.of(2022, 2, 14) , LocalDate.of(2022,12,24), false);
		
		listBeca.add(unaBeca01);
		listBeca.add(unaBeca03);
		listBeca.add(unaBeca02);
		
	}

	public ArrayList<Beca> getListBeca() {
		return listBeca;
	}

	public void setListBeca(ArrayList<Beca> listBeca) {
		this.listBeca = listBeca;
	}
	
	

}
