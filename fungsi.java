package kalkulator;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Riana
 */
public interface fungsi extends Remote{
    public int tambah(int a, int b)throws RemoteException;
    public int kurang(int a, int b)throws RemoteException;
    public int kali(int a, int b)throws RemoteException;
    public int bagi(int a, int b)throws RemoteException;
    
}
