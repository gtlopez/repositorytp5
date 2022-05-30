package fi.unju.edu.ar.tp5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AgendaController {
	@GetMapping("/agenda")
	public String getAgendaPage() {
		return "agenda";
		
	}

}
