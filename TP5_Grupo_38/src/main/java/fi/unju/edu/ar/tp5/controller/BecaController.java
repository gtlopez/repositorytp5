package fi.unju.edu.ar.tp5.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fi.unju.edu.ar.tp5.util.ListaBecas;

@RequestMapping("/beca")
@Controller
public class BecaController {
	private static final Log LOGGER = LogFactory.getLog(CursoController.class);
	ListaBecas becas = new ListaBecas();
	
			
		@GetMapping("/listaBecas")
		public ModelAndView getListadoBecaPage() {
			ModelAndView modelAndView = new ModelAndView("lista_becas");
		
			modelAndView.addObject("becas", becas.getListBeca());
			return modelAndView;
		}
	
	
	
}
