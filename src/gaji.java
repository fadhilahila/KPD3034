/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User's
 */
import java.util.*;
public class gaji {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        
    String nama;
    int bil_hari;
    int bil_jam;
    int bil_jam_ot;
    int gaji;
    
    System.out.print("Masukkan nama anda: ");
     nama=input.nextLine();
     
    System.out.print("Masukkan bilangan jam bekerja anda: ");
    bil_jam=input.nextInt();
    while (bil_jam > 9){
        System.out.println ("Bilangan jam bekerja tidak boleh melebihi 9 jam. Sila masukkan bilangan jam yang betul.");
    System.out.print ("Masukkan bilangan jam bekerja anda: ");
    bil_jam=input.nextInt();
    }
    System.out.print("Masukkan bilangan hari bekerja anda: ");
    bil_hari=input.nextInt();
    while (bil_hari > 30){
        System.out.println("Bilangan hari bekerja tidak boleh melebihi 30 hari. Sila masukkan bilangan hari yang betul.");
    System.out.print("Masukkan bilangan hari bekerja anda: ");
    bil_hari=input.nextInt();
    }
    System.out.print("Masukkan bilangan jam OT anda: ");
    bil_jam_ot=input.nextInt();
    while (bil_jam_ot > 50){
        System.out.println("Bilangan jam ot tidak boleh melebihi 50 jam. Sila masukkan bilangan yang betul.");
    System.out.print("Masukkan bilangan jam ot anda: ");
    bil_jam_ot=input.nextInt();
    }
    
    gaji=(bil_jam*bil_hari*20)+(bil_jam_ot * 15);
    
    System.out.println("===========================");
    System.out.println("Rumusan gaji:"+nama);
    System.out.println("jumlah jam bekerja:"+bil_jam);
    System.out.println("jumlah hari bekerja:"+bil_hari);
    System.out.println("jumlah jam kerja lebih masa:"+bil_jam_ot+"jam");
    System.out.println("jumlah gaji: RM"+gaji);
    System.out.println("===========================");
    }
    }
