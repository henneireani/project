/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum19;
import java.util.Scanner;
public class NilaiTerbesar {
    public static void main(String[] args) {
        // Buat Scanner
        Scanner input = new Scanner(System.in);
        int angka1, angka2, besar;
        System.out.print("Masukkan Angka Pertama = ");
        angka1=input.nextInt();
        System.out.print("Masukkan Angka Kedua = ");
        angka2=input.nextInt();
        if(angka1>angka2)
            besar=angka1;
        else
            besar=angka2;
        System.out.print("Nilai Terbesar Adalah = "+besar);
        
        
    }
}
