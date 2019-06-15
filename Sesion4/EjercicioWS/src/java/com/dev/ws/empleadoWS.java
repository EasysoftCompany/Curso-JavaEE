/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.ws;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author g_ric
 */

@WebService(serviceName = "empleadoWS")
public class empleadoWS {
    private static int contador = 1;
    private static List<Empleado> lista = new ArrayList<>();
    
    static {
        for (int i = 0; i < 3; i++) {
            Empleado emp = new Empleado();
             Departamento d = new Departamento(contador, "Departamento "+contador);
             
             emp.setId(contador);
             emp.setNombre("Test "+ contador);
             emp.setApellido("LST "+ contador);
             emp.setDpto(d);
             
             lista.add(emp);
             contador++;
        }
    }
    
    @WebMethod(operationName = "registrarEmpleado")
     public boolean guardaEmpleado(@WebParam(name = "Nombre") String Nombre, @WebParam(name = "Apellido") String Apellido) throws Exception
     {
         System.out.println("Recibiendo... Nombre -> "+ Nombre + " Apellido -> "+ Apellido);
         if(!Nombre.isEmpty() && !Apellido.isEmpty())
         {
             Empleado emp = new Empleado();
             Departamento d = new Departamento(contador, "Departamento "+contador);
             
             emp.setId(contador);
             emp.setNombre(Nombre);
             emp.setApellido(Apellido);
             emp.setDpto(d);
             
             lista.add(emp);
             
             contador++;
             
             return true;
         }else
         {
             throw new Exception("Nombre y apellidos son necesarios!");
         }
        
     }
     
     
     @WebMethod(operationName = "consultaEmpleados")
     public List<Empleado> getEmpleados()        
     {
         return lista;
     }
}
