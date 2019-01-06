/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Riana
 */
public class operasi extends UnicastRemoteObject implements fungsi{
    int hasil;
    public operasi()throws RemoteException{
        
    }

    public int tambah(int a, int b) throws RemoteException {
        hasil=a+b;
        return hasil;
    }

  
    public int kurang(int a, int b) throws RemoteException {
         hasil=a-b;
        return hasil;
    }

   
    public int kali(int a, int b) throws RemoteException {
         hasil=a*b;
        return hasil;
    }

    
    public int bagi(int a, int b) throws RemoteException {
        hasil=a/b;
        return hasil;
}
}
