/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum19;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
    int noHari;
        System.out.print("Masukkan No Hari = ");
    noHari=input.nextInt();
    switch (noHari) {
        case 1 :
            System.out.println("Senin");
            break;
        case 2 :
            System.out.println("Selasa");
            break;
        case 3 :
            System.out.println("Rabu");
            break;
        case 4 :
            System.out.println("Kamis");
            break;
        case 5 :
            System.out.println("Jum'at");
            break;
        case 6 :
            System.out.println("Sabtu");
            break;
        case 7 :
            System.out.println("Minggu");
            break;
        default:
            System.out.println("Tidak ada hari");
        
       
    }
    
    
}
    
}
