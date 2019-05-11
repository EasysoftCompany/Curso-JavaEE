/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.ejb;

import javax.ejb.Local;

/**
 *
 * @author g_ric
 */
@Local
public interface MiSaludoSessionLocal {

    String decirHola(String nombre);
    
}
