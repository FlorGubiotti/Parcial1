package com.facu.parcial.Controllers;

import com.facu.parcial.Entities.Domicilio;
import com.facu.parcial.Services.DomicilioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/domicilios")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImpl>{


}
