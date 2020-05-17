package com.redsocial.repositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.redsocial.entidad.Alumno;

@Repository
public class AlumnoMySqlRepositorio implements AlumnoRepositorio{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insertaAlumno(Alumno obj) {
		return jdbcTemplate.update("insert into alumno values(null,?,?,?)",new Object[]{ obj.getNombre(), obj.getDni(), obj.getCorreo()});     
	}

}
