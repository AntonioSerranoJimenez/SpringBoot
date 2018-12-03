package com.api.restful.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.api.restful.converter.Converter;
import com.api.restful.entity.Nota;
import com.api.restful.model.NotaModel;
import com.api.restful.repository.NotaRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class NotaService.
 */
@Service("servicio")
public class NotaService {

	/** The repositorio. */
	@Autowired
	@Qualifier("repositorio")
	private NotaRepository repositorio;

	/** The convertidor. */
	@Autowired
	@Qualifier("convertidor")
	private Converter convertidor;

	/**
	 * Crear.
	 *
	 * @param nota the nota
	 * @return true, if successful
	 */
	public boolean crear(Nota nota) {

		try {
			repositorio.save(nota);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Actualizar.
	 *
	 * @param nota the nota
	 * @return true, if successful
	 */
	public boolean actualizar(Nota nota) {
		try {
			repositorio.save(nota);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Borrar.
	 *
	 * @param nota the nota
	 * @return true, if successful
	 */
	public boolean borrar(Nota nota) {
		try {
			repositorio.delete(nota);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Obtener.
	 *
	 * @return the list
	 */
	public List<NotaModel> obtener() {
		return convertidor.convertirLista(repositorio.findAll());
	}
	
}
