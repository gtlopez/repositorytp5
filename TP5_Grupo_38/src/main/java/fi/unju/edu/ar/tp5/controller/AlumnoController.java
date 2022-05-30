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

import fi.unju.edu.ar.tp5.model.Alumno;
import fi.unju.edu.ar.tp5.model.Docente;
import fi.unju.edu.ar.tp5.util.ListaAlumnos;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {
	private static final Log LOGGER = LogFactory.getLog(AlumnoController.class);
	ListaAlumnos alumnos = new ListaAlumnos();
	
	@GetMapping("/listaAlumnos")
	public ModelAndView getListadoAlumnoPage() {
		ModelAndView modelAndView = new ModelAndView("lista_alumnos");
		modelAndView.addObject("alumnos", alumnos.getListAlumno());
		return modelAndView;
	}	
	
	@GetMapping("/nuevoAlumno")
	public String getAltaAlumnoPage(Model model) {
		
		Alumno nuevoAlumno=new Alumno();
		model.addAttribute("alumno", nuevoAlumno);
		return "nuevo_alumno";
	}
	
	@PostMapping("/guardarAlumno")
	public ModelAndView getGuardarAlumnoPage(@ModelAttribute("alumno")Alumno alumno) {
		
		ModelAndView modelAndView = new ModelAndView("lista_alumnos");		
		if(alumnos.getListAlumno().add(alumno)) {
			LOGGER.info("Se agregó un objeto al arrayList de Alumnos");
		}
		modelAndView.addObject("alumnos", alumnos.getListAlumno());
		return modelAndView;
	}
	

}