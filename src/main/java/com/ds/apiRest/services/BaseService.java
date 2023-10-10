package com.ds.apiRest.services;

import com.ds.apiRest.entities.Base;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public interface BaseService<E extends Base, ID extends Serializable>{

    //Metodo para traer todas las personas(instancias de una entidad) de la BD (GET)
    public List<E> findAll() throws Exception;

    public Page<E> findAll(Pageable pageable) throws Exception;

    //Metodo para traer una entidad(instancia) dependiendo de su Id (GET)
    public E findById(ID id) throws Exception;

    //Metodo para crear una nueva entidad (POST)
    public E save(E entity) throws Exception;

    //Metodo para actualizar una entidad (UPDATE)
    public E update(ID id, E entity) throws Exception;

    //Metodo para eliminar una entidad (DELETE)
   public boolean delete(ID id) throws Exception;
}
