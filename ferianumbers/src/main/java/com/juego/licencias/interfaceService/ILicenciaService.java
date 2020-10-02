package com.juego.licencias.interfaceService;

import java.util.List;
import java.util.Optional;

import com.juego.licencias.modelo.Licencia;

public interface ILicenciaService {
	public List<Licencia>listar();
	public Optional<Licencia>listarId(int id);
	public int save (Licencia l);
	public void delete (int id);
}
