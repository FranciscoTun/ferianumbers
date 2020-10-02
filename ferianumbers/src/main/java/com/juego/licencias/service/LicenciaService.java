package com.juego.licencias.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juego.licencias.interfaceService.ILicenciaService;
import com.juego.licencias.interfaces.ILicencia;
import com.juego.licencias.modelo.Licencia;

@Service
public class LicenciaService implements ILicenciaService{

	@Autowired
	private ILicencia data;
	
	@Override
	public List<Licencia> listar() {
		return (List<Licencia>)data.findAll();
	}

	@Override
	public Optional<Licencia> listarId(int id) {
		return (Optional<Licencia>)data.findById(id);

	}

	@Override
	public int save(Licencia l) {
		int res=0;
		Licencia licencia = data.save(l);
		if(!licencia.equals(null)) {
			res = 1;
		}
		return res;
	}
	

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
