/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author g_ric
 */
@Stateless
public class MiSaludoSession implements MiSaludoSessionLocal {

    @Override
    public String decirHola(String nombre) {
        return "Hola " + nombre;
    }

}
