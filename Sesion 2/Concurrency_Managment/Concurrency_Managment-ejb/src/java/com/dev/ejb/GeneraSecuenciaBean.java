/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.ejb;

import javax.ejb.AccessTimeout;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.LocalBean;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;

/**
 *
 * @author g_ric
 */
@Singleton
@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER)
public class GeneraSecuenciaBean implements GeneraSecuencia {

    private Long contador = 0L;

    @AccessTimeout(1500)
    @Lock(LockType.READ)

    @Override
    public String getSecuencia() {
        System.out.println("Lo vi!");
        return "UUID: " + contador;

    }

 
    @Lock(LockType.WRITE)
    @AccessTimeout(300000)
    @Override
    public void modificaValor() {
        contador++;
        System.out.println("INCREMENTO " + contador);
    }

}
