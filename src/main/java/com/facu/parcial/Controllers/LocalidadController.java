package com.facu.parcial.Controllers;

import com.facu.parcial.Entities.Localidad;
import com.facu.parcial.Services.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl>{

}
