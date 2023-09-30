package com.facu.parcial.Controllers;

import com.facu.parcial.Entities.Autor;
import com.facu.parcial.Services.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl>{

}
