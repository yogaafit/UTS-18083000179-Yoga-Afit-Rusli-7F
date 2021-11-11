/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts.pkg18083000179.yoga.afit.rusli.pkg7f;

import java.util.Scanner;
public class UTS18083000179YogaAfitRusli7F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int berat;
      double tinggi;
      double bmi;
      
        System.out.println("masukkan berat :");
        berat = input.nextInt();
        System.out.println("masukkan tinggi :");
        tinggi = input.nextDouble();
        tinggi/=100;
        bmi= berat/(tinggi*tinggi);
        System.out.println("Bmi mu adalah"+ bmi);
        
        if(bmi<18.5){
        System.out.println("kurang berat badan");
    }
        else if(bmi>24.9){
        System.out.println("normal");
    }
        else if(bmi>28.9){
        System.out.println("gemuk");
    }
        else{
                System.out.println("obesitas");
                }
    }
    
}
