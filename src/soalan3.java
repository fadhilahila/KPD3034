/*Anda dikehendaki membuat satu aturcara yang memberi maklumat status penderma berdasarkan input jenis
darah yang diberi oleh pengguna. Gunakan struktur kawalan if sahaja dalam membuat syarat jenis darah.
Berikut adalah maklumat mengenai penderma berdasarkan jenis kumpulan darah.
A = Menderma kepada A dan AB sahaja
B = Menderma kepada B dan AB sahaja
AB = Menderma kepada AB sahaja
O = Menderma kepada A, B, AB dan O
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User's
 */
import java.util.Scanner;
public class soalan3 {
    public static void main (String[] args){
        Scanner taip = new Scanner(System.in);
        
        String nama;
        char kumpdarah;
        String makluman;
        System.out.println("Nama anda");
        nama = taip.nextLine();
        
        System.out.println("kumpulan darah : Taip A/B/O/Z[AB]");
        kumpdarah = taip.next().charAt(0);
        taip.close();
        
        if (kumpdarah=='A'){
        } makluman="A dan AB sahaja";
        if (kumpdarah=='B'){
        } makluman="B dan AB sahaja";
        if (kumpdarah=='Z'){
        } makluman="AB sahaja";
        if (kumpdarah=='O'){
            makluman="A, B, AB dan O";
        }
        
        System.out.println("Nama : "+nama);
        System.out.println("Kumpulan darah : "+kumpdarah);
        System.out.println("Anda boleh menderma kepada " +makluman);
    }
}
