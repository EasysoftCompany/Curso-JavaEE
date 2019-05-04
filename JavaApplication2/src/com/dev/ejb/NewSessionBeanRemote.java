/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.ejb;

import javax.ejb.Remote;

/**
 *
 * @author g_ric
 */
@Remote
public interface NewSessionBeanRemote {

    float suma(float n1, float n2);

    float resta(float n1, float n2);
    
}
