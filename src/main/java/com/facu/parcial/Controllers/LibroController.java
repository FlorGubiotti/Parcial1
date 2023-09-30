package com.facu.parcial.Controllers;

import com.facu.parcial.Entities.Libro;
import com.facu.parcial.Services.LibroServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/libros")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl>{

}