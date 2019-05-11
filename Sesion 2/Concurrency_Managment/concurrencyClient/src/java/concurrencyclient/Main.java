/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencyclient;

import com.dev.ejb.GeneraSecuencia;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author g_ric
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            InitialContext ic = new InitialContext();
            GeneraSecuencia gsb = (GeneraSecuencia) ic.lookup("java:global/Concurrency_Managment/Concurrency_Managment-ejb/GeneraSecuenciaBean");
            for (int i = 0; i < 100; i++) {
                System.out.println(gsb.getSecuencia());
                Thread.sleep(1000);
            }
        } catch (NamingException | InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
