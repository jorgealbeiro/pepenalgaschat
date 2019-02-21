/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uptc.sisdist.suma;

import java.rmi.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Interface remota con los métodos que se pueden llamar de forma remota
 *
 * @author Carlos Arenas
 */
public interface InterfaceRemota extends Remote {

    public int suma(int a, int b) throws RemoteException;

    public int multiplicar(int a, int b) throws RemoteException;

    public int resta(int a, int b) throws RemoteException;

    public int division(int a, int b) throws RemoteException;

//    public List<String> listaUsuarios(String name) throws RemoteException;
    public void listaUsuarios(String name) throws RemoteException;

    public String listaUsuarios1(String s) throws RemoteException;

    public String enviarChat(String s) throws RemoteException;
}
