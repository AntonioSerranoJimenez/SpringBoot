package com.api.restful.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Nota.
 */
@Table(name = "NOTA")
@Entity
//@XmlRootElement
public class Nota implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -8682924121821105211L;

	/** The id. */
	@GeneratedValue
	@Id
	@Column(name = "ID_NOTA")
	private long id;

	/** The nombre. */
	@Column(name = "NOMBRE")
	private String nombre;

	/** The titulo. */
	@Column(name = "TITULO")
	private String titulo;

	/** The contenido. */
	@Column(name = "CONTENIDO")
	private String contenido;

	/**
	 * Instantiates a new nota.
	 */
	public Nota() {
	}

	/**
	 * Instantiates a new nota.
	 *
	 * @param id        the id
	 * @param nombre    the nombre
	 * @param titulo    the titulo
	 * @param contenido the contenido
	 */
	public Nota(long id, String nombre, String titulo, String contenido) {
		this.id = id;
		this.nombre = nombre;
		this.titulo = titulo;
		this.contenido = contenido;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the titulo.
	 *
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Sets the titulo.
	 *
	 * @param titulo the new titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Gets the contenido.
	 *
	 * @return the contenido
	 */
	public String getContenido() {
		return contenido;
	}

	/**
	 * Sets the contenido.
	 *
	 * @param contenido the new contenido
	 */
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

}
