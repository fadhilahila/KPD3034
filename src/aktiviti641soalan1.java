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
public class aktiviti641soalan1 {
    public static void main(String[] args){
        
        String nama;
        String ulasan;
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan nama anda: ");
        nama=input.nextLine();
        
        System.out.println("Masukkan nombor pertama: ");
        int no1=input.nextInt ();
        
        System.out.println("Masukkan nombor kedua: ");
        int no2=input.nextInt();
        
        if (no2>no1){
            ulasan="Nombor kedua adalah lebih besar";
            
        }else if (no1>no2){
            ulasan="Nombor pertama adalah lebih besar";
            
        }else {
            ulasan="Nombor pertama dan nombor kedua adalah sama besar";
        }
        System.out.println (ulasan);
        }
    }
