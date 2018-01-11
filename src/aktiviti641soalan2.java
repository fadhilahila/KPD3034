/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User's
 */
import java.util.Scanner;
public class aktiviti641soalan2 {
    public static void main (String[] args) {
        
        int gajiasas=800;
        double gaji;
        double bonus;
        int bilpelanggan;
       
        Scanner input= new Scanner (System.in);
        System.out.print ("Masukkan bilangan pelanggan yang diperolehi semasa: ");
        bilpelanggan=input.nextInt();
        
        if (bilpelanggan <=0){
            bonus=0;
        
        }if (bilpelanggan <=10){
            bonus=550;
            
        }else if (bilpelanggan <=50){
            bonus=2500;
          
        }else {
            bonus=1050;
            
        }
        gaji=gajiasas +bonus;
        System.out.println("Gaji anda: RM" +gaji);
        }
    }