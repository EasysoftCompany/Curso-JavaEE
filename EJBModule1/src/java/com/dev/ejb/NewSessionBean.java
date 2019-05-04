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
public class NewSessionBean implements NewSessionBeanRemote {

    @Override
    public float suma(float n1, float n2) {
        return n1+n2;
    }
    
    @Override
    public float resta(float n1, float n2) {
        return n1-n2;
    }
}
