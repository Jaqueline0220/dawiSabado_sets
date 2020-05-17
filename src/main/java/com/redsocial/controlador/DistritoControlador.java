package com.redsocial.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.redsocial.entidad.Distrito;
import com.redsocial.servicio.DistritoService;

@Controller
public class DistritoControlador {

	@Autowired
	private DistritoService service;
	
	@RequestMapping("/verDistrito")
	public String ver() {
		return "registraDistrito";
	}
	
	@RequestMapping("/registraDistrito")
	public String registro(Distrito obj) {
		service.inserrtaDistrito(obj);
		return "registraDistrito";
	}
}




