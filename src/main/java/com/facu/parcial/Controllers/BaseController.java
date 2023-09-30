package com.facu.parcial.Controllers;

import com.facu.parcial.Entities.BaseEntidad;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface BaseController<E extends BaseEntidad, ID extends Serializable>{

    ResponseEntity<?> getAll();

    ResponseEntity<?> getOne(@PathVariable ID id);

    ResponseEntity<?> save(@RequestBody E entity);

    ResponseEntity<?> update(@PathVariable ID id, @RequestBody E entity);

    ResponseEntity<?> delete(@PathVariable ID id);




}
