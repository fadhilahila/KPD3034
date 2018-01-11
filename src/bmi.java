/*Anda dikehendaki membina satu program mengira BMI (Body Mass Index). Input pengguna adalah tinggi dalam
unit meter dan berat dalam unit kilogram. BMI dapat dikira dengan cara BMI=Berat(kg/[Tinggi(m)]2. Berikut
adalah nilai BMI mengikut skala standard. BMI kurang dari 18.5 adalah kurang berat badan, BMI kurang dari
25 berada pada tahap normal, BMI kurang dari 30 adalah berat badan berlebihan dan selebihnya adalah gemuk.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User's
 */
import java.util. *;
public class bmi {
    public static void main(String[] args){
        
        double bmi;
        String Ulasan;
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan berat badan anda dalam ukuran kg: " );
        double berat=input.nextDouble();
        
        System.out.print("Masukkan tinggi anda dalam ukuran meter: " );
        double tinggi=input.nextDouble();
        
        bmi=berat/(tinggi*tinggi);
        
        if (bmi < 18.5){
            Ulasan="kurang daripada yang sepatutnya";
        
        }else if (bmi < 25){
            Ulasan="normal";
            
        }else if (bmi < 30){
            Ulasan="berlebihan";
            
        }else{
            Ulasan="gemuk";
        }
        System.out.println("Anda mempunyai berat badan yang "+Ulasan );
            
        
        }
    }
