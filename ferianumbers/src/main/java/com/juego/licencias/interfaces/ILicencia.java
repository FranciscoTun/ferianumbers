package com.juego.licencias.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.juego.licencias.modelo.Licencia;

@Repository
public interface ILicencia extends CrudRepository<Licencia, Integer> {

}
