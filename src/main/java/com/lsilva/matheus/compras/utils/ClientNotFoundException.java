package com.lsilva.matheus.compras.utils;

public class ClientNotFoundException extends RuntimeException{

    public ClientNotFoundException(){
         super("Client not found");
    }
}
