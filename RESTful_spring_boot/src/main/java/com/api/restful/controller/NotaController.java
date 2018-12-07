package com.api.restful.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.restful.entity.Nota;
import com.api.restful.model.NotaModel;
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

	/**
	 * Actualizar nota.
	 *
	 * @param nota the nota
	 * @return true, if successful
	 */
	@PostMapping("/nota")
	public boolean actualizarNota(@RequestBody @Valid Nota nota) {
		return servicio.actualizar(nota);
	}

	/*
	 * @DeleteMapping("/nota/{id}/{nombre}") public boolean
	 * borrarNota(@PathVariable("id") long id, @PathVariable("nombre") String
	 * nombre) { return servicio.borrar(nombre, id); }
	 */

	/**
	 * Borrar nota.
	 *
	 * @param nota the nota
	 * @return true, if successful
	 */
	@DeleteMapping("/nota")
	public boolean borrarNota(@RequestBody @Valid Nota nota) {
		return servicio.borrar(nota);
	}

	/**
	 * Obtener notas.
	 *
	 * @param pageable the pageable
	 * @return the list
	 */
	@GetMapping("/notas")
	public List<NotaModel> obtenerNotas(Pageable pageable) {
		// return servicio.obtener();
		return servicio.obtenerPaginacion(pageable);
	}

}
