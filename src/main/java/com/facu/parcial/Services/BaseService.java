package com.facu.parcial.Services;

import com.facu.parcial.Entities.BaseEntidad;

import java.io.Serializable;
import java.util.List;

public interface BaseService  <E extends BaseEntidad,ID extends Serializable> {

    List<E> findALL() throws Exception;

    E findById(ID id) throws Exception;

    E save(E entity) throws Exception;

    E update(ID id, E entity) throws Exception;

    boolean delete(ID id) throws Exception;

}
