/*Anda dikehendaki membina satu aturcara yang dapat menukarkan nilai tahun kepada bentuk tahun kalendar
cina.
Contohnya tahun 2017 adalah tahun ayam.
Dengan menggunakan struktur kawalan switch-case bina aturcara tersebut.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User's
 */
import java.util.Scanner;
public class tahunkelahiran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taipkan tahun: " );
    int year = input.nextInt();
    switch (year % 12) {
        case 0 : System.out.println( "monyet" ); break;
        case 1 : System.out.println ( "ayam"); break;
        case 2 : System.out.println ( "anjing"); break;
        case 3 : System.out.println ( "babi"); break;
        case 4 : System.out.println ( "tikus"); break;
        case 5 : System.out.println ( "lembu"); break;
        case 6 : System.out.println ( "harimau"); break;
        case 7 : System.out.println ( "arnab"); break;
        case 8 : System.out.println ( "naga"); break;
        case 9 : System.out.println ( "ular"); break;
        case 10 : System.out.println ( "kuda"); break;
        case 11 : System.out.println ( "kambing");
    }
    }
}
