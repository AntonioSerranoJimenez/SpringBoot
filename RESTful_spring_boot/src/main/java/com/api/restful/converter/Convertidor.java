package com.api.restful.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.api.restful.entity.Nota;
import com.api.restful.model.NotaModel;

// TODO: Auto-generated Javadoc
/**
 * The Class Convertidor.
 */
@Component("convertidor")
public class Convertidor {

	/**
	 * Convertir lista.
	 *
	 * @param notas the notas
	 * @return the list
	 */
	public List<NotaModel> convertirLista(List<Nota> notas) {
		List<NotaModel> mnotas = new ArrayList<>();
		for (Nota nota : notas) {
			mnotas.add(new NotaModel(nota));
		}
		return mnotas;
	}

}
