package com.threepillarglobal.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("multiplicacion")
public class Multi implements  Operacion{


    @Override
    public double operacion(int a, int b) {
        return a*b;
    }
}
