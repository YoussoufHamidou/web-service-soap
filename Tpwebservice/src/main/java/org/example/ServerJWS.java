package org.example;

import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
       String url= "http://0.0.0.0:8787/";
        Endpoint.publish("http://0.0.0.0:8787/",new BanqueService());
        System.out.println("Web service deploy sur "+url);
    }
}
