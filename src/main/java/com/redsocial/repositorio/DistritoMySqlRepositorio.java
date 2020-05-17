package com.redsocial.repositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.redsocial.entidad.Distrito;

//La clase pertenece al paquete de datos
@Repository
public class DistritoMySqlRepositorio implements DistritoRepositorio {

	//Spring va injectar el objecto al compilar la clase
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insertaDistrito(Distrito obj) {
		String sql = "insert into distrito values(null,?)";
		Object[] values = {obj.getNombre()};
		return jdbcTemplate.update(sql, values);
	}

}
