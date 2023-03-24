package com.threepillarglobal.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("suma")
public class Suma implements  Operacion{


    @Override
    public double operacion(int a, int b) {
        return a+b;
    }
}
