package com.threepillarglobal.example;

import com.fasterxml.jackson.annotation.JacksonInject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class Test {

    @Autowired
    @Qualifier("multiplicacion")
    Operacion operacion;

    @Autowired
    @Qualifier("suma")
    Operacion operacion2;

    @GetMapping("/hello/{id}")
    public String getHello(@PathVariable("id") String nombre) {
        log.info("Este es un mensaje de error");
        return "Hello " + nombre;
    }

    @GetMapping("/operacion")
    public Double getOperacion(){
        return operacion.operacion(1,2) +operacion2.operacion(1,2);
    }
}
