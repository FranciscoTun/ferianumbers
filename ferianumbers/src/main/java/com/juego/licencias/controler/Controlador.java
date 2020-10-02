package com.juego.licencias.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.juego.licencias.interfaceService.ILicenciaService;
import com.juego.licencias.modelo.Licencia;


@Controller
@RequestMapping

public class Controlador {
	
	@Autowired
	private ILicenciaService service;
	
	@GetMapping("/inicio")
	public String listar(Model model) {
		List<Licencia>licencias = service.listar();
		model.addAttribute("licencias", licencias);
		return "index";
	}
	

}
