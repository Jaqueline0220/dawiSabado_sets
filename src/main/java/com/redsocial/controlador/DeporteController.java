package com.redsocial.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.redsocial.entidad.Deporte;
import com.redsocial.servicio.DeporteServicio;

@Controller
public class DeporteController {

	@Autowired
	private DeporteServicio servicio;
	
	@RequestMapping("/verDeporte")
	public String verDeporte() {
		return "registraDeporte";
	}

	@RequestMapping("/registraDeporte")
	public String regDeporte(Deporte obj) {
		servicio.insertaDeporte(obj);
		return "registraDeporte";
	}
	
}



