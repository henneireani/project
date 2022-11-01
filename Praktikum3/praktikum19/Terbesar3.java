/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum19;

import java.util.Scanner;

public class Terbesar3 {

    public static void main(String[] args) {
        // Buat Scanner
        Scanner input = new Scanner(System.in);
        int angka1, angka2, angka3, besar;
        System.out.print("Masukkan Angka Pertama = ");
        angka1=input.nextInt();
        System.out.print("Masukkan Angka Kedua = ");
        angka2=input.nextInt();
        System.out.print("Masukkan Angka Ketiga = ");
        angka3=input.nextInt();
        if(angka1>angka2&&angka1>angka3){
            System.out.println("Angka pertama5 yang terbesar");
        }
        else if(angka2>angka1&&angka2>angka3){
            System.out.println("Angka kedua yang terbesar");
        }
        else if(angka3>angka1&&angka3>angka2){
            System.out.println("Angka ketiga yang terbesar");
        }else
            System.out.println("Angka yang anda inputkan sama");  
        
    }
}


