/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsclient;

import com.dev.ws.NewWebService_Service;

/**
 *
 * @author g_ric
 */
public class WSCLIENT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(sayHello("Gerardo"));
      }

    private static String sayHello(java.lang.String username) {
        com.dev.ws.NewWebService_Service service = new com.dev.ws.NewWebService_Service();
        com.dev.ws.NewWebService port = service.getNewWebServicePort();
        return port.sayHello(username);
    }
    
}
