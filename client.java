/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.Naming;
import java.rmi.NotBoundException;

/**
 *
 * @author Riana
 */
public class client {
    int a,b;
    String tanya;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public void menu()throws IOException, NotBoundException{
        fungsi f =(fungsi)Naming.lookup("rmi://localhost:1099/data");
        System.out.println("kalkulator");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("Pilih Operasi:");
        int pilih = Integer.parseInt(br.readLine());
        switch(pilih){
            case 1:
                System.out.println("Masukkan Angka Pertama\t: ");
                a = Integer.parseInt(br.readLine());
                System.out.println("Masukkan Angka Kedua\t: ");
                b = Integer.parseInt(br.readLine());
                System.out.println("Hasilnya: "+f.tambah(a, b));
                new client().keluar();
                break;
                
                case 2:
                System.out.println("Masukkan Angka Pertama\t: ");
                a = Integer.parseInt(br.readLine());
                System.out.println("Masukkan Angka Kedua\t: ");
                b = Integer.parseInt(br.readLine());
                System.out.println("Hasilnya: "+f.kurang(a, b));
                new client().keluar();
                break;
                
                case 3:
                System.out.println("Masukkan Angka Pertama\t: ");
                a = Integer.parseInt(br.readLine());
                System.out.println("Masukkan Angka Kedua\t: ");
                b = Integer.parseInt(br.readLine());
                System.out.println("Hasilnya: "+f.kali(a, b));
                new client().keluar();
                break;
                
                case 4:
                System.out.println("Masukkan Angka Pertama\t: ");
                a = Integer.parseInt(br.readLine());
                System.out.println("Masukkan Angka Kedua\t: ");
                b = Integer.parseInt(br.readLine());
                System.out.println("Hasilnya: "+f.bagi(a, b));
                new client().keluar();
                break;
        }
        if(pilih>4){
            System.out.println("Pilihan tidak ada");
            menu();
        }
        
    }
    public void keluar ()throws IOException, NotBoundException{
        System.out.println("Apakah Anda ingin melakukan operasi lagi? ya atau tidak");
        tanya = br.readLine();
        if(tanya.equals("ya")){
            new client().menu();
        }else if(tanya.equals("tidak")){
    }
 
}
    public static void main(String[] args)throws IOException, NotBoundException{
        client c = new client();
        c.menu();
    }
    }
