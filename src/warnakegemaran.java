/*Bina satu program ringkas yang memaparkan nama, jantina, warna kegemaran dan memberi ulasan mengenai warna
kegemaran yang dipilh.
Rujukan ulasan warna:
Warna Merah = Membawa makna kekuatan, kemarahan dan semangat.
Warna Biru = Membawa maksud ketenangan, keikhlasan dan harapan.
Warna Kuning = Melambangkan kegembiraan, penuh semangat dan riang.
Warna Hijau = Menggambarkan kehidupan, kestabilan, kedamaian dan ketulenan.
Warna Hitam = Dikaitkan dengan kejahatan, kengerian dan penuh kerahsiaan.
Warna Putih = Adalah berani tetapi tidak suka menampakkan keberanian.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User's
 */
import java.util.*;
public class warnakegemaran {
    public static void main(String[] args){
        
        String ulasan = null;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama anda: " );
        String nama=input.next();
        
        System.out.print("Taipkan warna kegemaran anda\n merah/biru/kuning/hijau/hitam/putih: ");
        
        String warna=input.next();
        
        switch(warna) {
            case "merah" :{
            ulasan="membawa makna kekuatan, kemarahan dan semangat";
           break;
            }case "biru" :{
             ulasan=("membawa maksud ketenangan, keikhlasan dan harapan.");
           break;
            }case "kuning" :{
             ulasan=("melambangkan kegembiraan, penuh semangat dan riang");
           break;
            }case "hijau" :{
             ulasan=("menggambarkan kehidupan, kestabilan dan ketulenan");
             break;
            }case "hitam" :{
             ulasan=("dikaitkan dengan kejahatan dan penuh kerahsiaan. ");
             break;
            }case "putih" :{
             ulasan=("adalah berani tetapi tidak suka tunjukkan keberanian. ");
             break;
            }default :{
                
        System.out.println("Maaf pilihan salah ");
            }
        }
           System.out.println(nama+", warna anda "+ulasan);
            }
        }
