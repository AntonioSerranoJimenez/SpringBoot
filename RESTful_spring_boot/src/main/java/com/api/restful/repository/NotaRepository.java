package com.api.restful.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.restful.entity.Nota;

/**
 * The Interface NotaRepositorio.
 */
@Repository("repositorio")
public interface NotaRepository extends JpaRepository<Nota, Serializable> {

	/**
	 * Find by nombre.
	 *
	 * @param nombre the nombre
	 * @return the list
	 */
	public abstract List<Nota> findByNombre(String nombre);

	/**
	 * Find by titulo.
	 *
	 * @param titulo the titulo
	 * @return the list
	 */
	public abstract List<Nota> findByTitulo(String titulo);

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the nota
	 */
	public abstract Nota findById(long id);

}
