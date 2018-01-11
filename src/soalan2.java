/*Anda dikehendaki membuat satu aturcara yang dapat mengesan markah yang dimasukkan adalah sama bagi dua
mata pelajaran. Contohnya mata pelajaran sains dan matematik. Gunakan struktur kawalan if untuk membuat
ujian ke atas input yang dimasukkan oleh pengguna. Jika gred sama, paparkan output "Gred yang diperolehi
sama" dan sebaliknya.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User's
 */
import java.util.Scanner;
public class soalan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char sains;
        char math;
        
        System.out.println("Apakah gred bagi Math:[A/B/C/D/E/G]");
            sains=input.next().charAt(0);
        System.out.println("Apakah gred bagi Sains:[A/B/C/D/E/G]");
            math=input.next().charAt(0);
    
    if (sains==math)
        System.out.println("Gred yang diperolehi sama");
    if (sains!=math) // also CORRECT>
        System.out.println("Gred yang diperolehi tidak sama");
    }
}
