/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteejerciciows;

import com.dev.ws.Departamento;
import com.dev.ws.Empleado;
import com.dev.ws.Exception_Exception;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author g_ric
 */
public class ClienteEjercicioWS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        try {
            registrarEmpleado("GGG", ""); //CON ERROR PORQUE NO TIENE CONTENIDO EL SEGUNDO PARAMETRO
            
        } catch (Exception_Exception ex) {
            Logger.getLogger(ClienteEjercicioWS.class.getName()).log(Level.SEVERE, null, ex);
        }
           
          todos();
        
    }
    
    private static void todos()
    {
        List<Empleado> c = consultaEmpleados();

        try {
            JAXBContext context = JAXBContext.newInstance(Empleado.class);
            /*
                Marshaller = Java to XML
                Unmarshaller = XML to Java
             */
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);   //Usado para que la salida tenga formato     
            

            for (Empleado s : c) {
                m.marshal(s, System.out);
                System.out.println(s.getId());
                System.out.println(s.getNombre());
                System.out.println(s.getApellido());
                Departamento dpto = (Departamento) s.getDpto();
                System.out.println(dpto.getId());
                System.out.println(dpto.getNombre());
                System.out.println("--------------------------------------------");
            }

        } catch (JAXBException ex) {
            Logger.getLogger(ClienteEjercicioWS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static java.util.List<com.dev.ws.Empleado> consultaEmpleados() {
        com.dev.ws.EmpleadoWS_Service service = new com.dev.ws.EmpleadoWS_Service();
        com.dev.ws.EmpleadoWS port = service.getEmpleadoWSPort();
        return port.consultaEmpleados();
    }

    private static boolean registrarEmpleado(java.lang.String arg0, java.lang.String arg1) throws Exception_Exception {
        com.dev.ws.EmpleadoWS_Service service = new com.dev.ws.EmpleadoWS_Service();
        com.dev.ws.EmpleadoWS port = service.getEmpleadoWSPort();
        return port.registrarEmpleado(arg0, arg1);
    }

}
