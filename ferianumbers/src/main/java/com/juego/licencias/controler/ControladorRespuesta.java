package com.juego.licencias.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juego.licencias.interfaceService.ILicenciaService;
import com.juego.licencias.modelo.Licencia;
import com.juego.licencias.modelo.Respuesta;


@Controller
@RestController
public class ControladorRespuesta {
	
	@Autowired
	private ILicenciaService service;
	
	@RequestMapping("/validar")
	public boolean getRespuesta(String valor) {
		boolean activacion = false;
		List<Licencia>licencias = service.listar();
		Licencia l = null;
		String busqueda = valor;
		boolean encontrado = false;
		for(int i =0; i< licencias.size(); i++) {
			l = licencias.get(i);
			
			if(l.getClave().equals(busqueda)){
				encontrado = true;
				if(l.getStatus()==0) {
					activacion = true;
					licencias.get(i).setStatus(1);
					Agregar(licencias.get(i));
				}else {
					activacion = false;
				}
				break;
			}
			
		}
		
		if(encontrado) {
			
		}else {
			activacion = false;
		}
			return activacion;
	}
	
	public void Agregar(Licencia l) {
		service.save(l);
	}
	
	
	public void editar(int id) {
		Optional<Licencia>persona = service.listarId(id);
	}
	
	
	
	
	
	@RequestMapping("/lista")
	public List<Licencia> getLista() {
		
		
		List<Licencia>licencias = service.listar();
		
		/*
		respuesta r;
		
		if(licencias.isEmpty()) {
			r =  new respuesta(1,"Prueba", "Esta vacio",0);
		}else {
			r = new respuesta(2,"Prueba", "No esta vacio",0);
		}
		*/
		return licencias;
	}
	
	
	//String buscar = "6NWWJ-YQWMR-QKGCB-6TMB3-9D9HK";
	
	@RequestMapping("/ver")
	public Licencia getLicencia(String valor) {
		List<Licencia>licencias = service.listar();
		Licencia l = null;
		String busqueda = valor;
		boolean encontrado = false;
		for(int i =0; i< licencias.size(); i++) {
			l = licencias.get(i);
			
			if(l.getClave().equals(busqueda)){
				encontrado = true;
				break;
			}
			
		}
		
		if(encontrado==false) {
			l = new Licencia(-1,"","","",0.0,"",-1);
		}
		
		
			
			return l;
	}
	
	
	
	
	
}
