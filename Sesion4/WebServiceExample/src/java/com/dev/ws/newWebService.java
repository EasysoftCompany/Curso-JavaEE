package com.dev.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName = "newWebService")
public class newWebService {
    
    @WebMethod(operationName ="sayHello")
    public String hello(@WebParam(name="username") String name){
        return "Hello " + name + "!";
    }
    
}
