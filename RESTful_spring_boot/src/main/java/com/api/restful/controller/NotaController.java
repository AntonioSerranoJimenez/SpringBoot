package com.api.restful.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.restful.entity.Nota;
import com.api.restful.service.NotaService;

// TODO: Auto-generated Javadoc
/**
 * The Class NotaController.
 */
@RestController
@RequestMapping("/v1")
public class NotaController {

	/** The servicio. */
	@Autowired
	@Qualifier("servicio")
	private NotaService servicio;

	/**
	 * Agregar nota.
	 *
	 * @param nota the nota
	 * @return true, if successful
	 */
	@PutMapping("/nota")
	public boolean agregarNota(@RequestBody @Valid Nota nota) {
		return servicio.crear(nota);
	}

}
