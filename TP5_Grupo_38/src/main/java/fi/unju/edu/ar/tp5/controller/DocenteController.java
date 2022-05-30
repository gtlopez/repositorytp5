package fi.unju.edu.ar.tp5.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fi.unju.edu.ar.tp5.model.Docente;
import fi.unju.edu.ar.tp5.util.ListaDocentes;

@Controller
@RequestMapping("/docente")

public class DocenteController {
	private static final Log LOGGER = LogFactory.getLog(DocenteController.class);
	ListaDocentes docentes = new ListaDocentes();
	
	@GetMapping("/listaDocentes")
	public ModelAndView getListadoDocentesPage() {
		
		ModelAndView modelAndView = new ModelAndView("lista_docentes");
		modelAndView.addObject("docentes", docentes.getListDocente());
		return modelAndView;
	}	
	
	@GetMapping("/nuevoDocente")
	public String getAltaDocentePage(Model model) {
		
		Docente nuevoDocente=new Docente();
		model.addAttribute("docente", nuevoDocente);
		return "nuevo_docente";
	}
	
	@PostMapping("/guardarDocente")
	public ModelAndView getGuardarDocentePage(@ModelAttribute("docente")Docente docente) {
		
		ModelAndView mav = new ModelAndView("lista_docentes");		
		if(docentes.getListDocente().add(docente)) {
			LOGGER.info("Se agregó un objeto al arrayList de docentes");
		}
		mav.addObject("docentes", docentes.getListDocente());
		return mav;
	}
	

}
