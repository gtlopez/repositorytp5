package fi.unju.edu.ar.tp5.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fi.unju.edu.ar.tp5.model.Alumno;
import fi.unju.edu.ar.tp5.model.Curso;
import fi.unju.edu.ar.tp5.util.ListaCursos;

import fi.unju.edu.ar.tp5.util.ListaDocentes;




@RequestMapping("/curso")
@Controller
public class CursoController {
	private static final Log LOGGER = LogFactory.getLog(CursoController.class);
	
	ListaCursos cursos = new ListaCursos();
	ListaDocentes docentes = new ListaDocentes();
	
	@GetMapping("/listaCursos")
	public ModelAndView getListadoCursoPage() {
		ModelAndView modelAndView = new ModelAndView("lista_cursos");
		//ListaCursos cursos = new ListaCursos();
		modelAndView.addObject("cursos", cursos.getListCurso());
		
		return modelAndView;
	}
	
	@GetMapping("/nuevoCurso")
	public String getAltaCursoPage(Model model) {
		
		Curso nuevoCurso = new Curso();
		model.addAttribute("curso", nuevoCurso);
		model.addAttribute("docentes", docentes.getListDocente());
		return "nuevo_curso";
	}

}