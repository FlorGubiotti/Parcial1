package com.facu.parcial.Controllers;

import com.facu.parcial.Entities.Persona;
import com.facu.parcial.Services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{

}
