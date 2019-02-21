/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uptc.sisdist.suma;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author Carlos Arenas
 */
public class ObjetoRemoto extends UnicastRemoteObject implements InterfaceRemota {

    public ArrayList<String> listaUsuarios;
    public String listUsers = "";
    public String contenidoChat = "";

    public ObjetoRemoto() throws RemoteException {
        super();
        listaUsuarios = new ArrayList<>();
    }

    @Override
    public int suma(int a, int b) {
        System.out.println("Sumando " + a + " + " + b + "...");
        return a + b;
    }

    public int multiplicar(int a, int b) {
        System.out.println("Multiplicando " + a + " * " + b + "...");
        return a * b;
    }

    @Override
    public int resta(int a, int b) throws RemoteException {
        System.out.println("Restando " + a + " * " + b + "...");
        return a - b;
    }

    @Override
    public int division(int a, int b) throws RemoteException {
        System.out.println("Dividiendo " + a + " * " + b + "...");
        return a / b;
    }

//    @Override
//    public ArrayList<String> listaUsuarios(String name) throws RemoteException {
//        listaUsuarios.add(name);
//        for (String listaUsuario : listaUsuarios) {
//            System.out.println("soy yo         __________");
//            System.out.println(listaUsuario);
//        }
//        return listaUsuarios;
//    }

     @Override
    public void listaUsuarios(String name) throws RemoteException {
        listaUsuarios.add(name);
        for (String listaUsuario : listaUsuarios) {
            System.out.println("soy yo         __________");
            System.out.println(listaUsuario);
        }       
    }
    
    @Override
    public String listaUsuarios1(String s) throws RemoteException {
        listUsers += s + '\n';
        return listUsers;

    }

    @Override
    public String enviarChat(String s) throws RemoteException {
        contenidoChat += s;
        return contenidoChat;
    }

}
