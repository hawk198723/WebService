package com.service_port;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class HelloService {
    public String Greeting(String name){
        System.out.println("Greeting method being called...");
        return "hello" + name;
    }
// http://127.0.0.1:8000/hello?wsdl
    public static void main(String[] args) {

        String address="http://127.0.0.1:8000/hello";
        Object implementor = new HelloService();
        Endpoint.publish(address, implementor);
    }
}