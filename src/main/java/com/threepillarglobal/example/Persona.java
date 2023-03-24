package com.threepillarglobal.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Persona {
    public String name;
    public String lastname;
    public int age;
}
