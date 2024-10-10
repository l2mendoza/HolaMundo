/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.holamundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Gamal
 */
@RestController

public class HolaMundoController {

    /**
     *
     * @return
     */
    @GetMapping("/hola")
    public String hello() {
        return "hola mundo";
       
    }
}
