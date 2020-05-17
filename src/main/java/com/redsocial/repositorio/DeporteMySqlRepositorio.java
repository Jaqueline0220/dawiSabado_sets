package com.redsocial.repositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.redsocial.entidad.Deporte;

@Repository
public class DeporteMySqlRepositorio implements DeporteRepositorio{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int inserta(Deporte obj) {
		return jdbcTemplate.update("insert into deporte values(null,?)" , new Object[]{ obj.getNombre()});     
	}

	
}
