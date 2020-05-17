package com.redsocial.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.redsocial.entidad.Alumno;
import com.redsocial.servicio.AlumnoServicio;

@Controller
public class AlumnoController {

	@Autowired
	private AlumnoServicio servicio;
	
	@RequestMapping("/verAlumno")
	public String metVerAlumno() {
		
		return "registraAlumno";
	}
	
	@RequestMapping("/registroDeAlumno")
	public String metRegistraAlumno(Alumno obj) {
		servicio.insertaAlumno(obj);
		return "registraAlumno";
	}
	
	
	
}
