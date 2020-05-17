package com.redsocial.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.entidad.Distrito;
import com.redsocial.repositorio.DistritoRepositorio;

@Service
public class DistritoServiceImpl implements DistritoService{

	@Autowired
	private DistritoRepositorio repositorio;
	
	@Override
	public int inserrtaDistrito(Distrito obj) {
		return repositorio.insertaDistrito(obj);
	}

}
