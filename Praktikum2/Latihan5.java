
package pbo;

import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        String nama;
        Scanner inputan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Masukkan Nama Lengkap Anda : ");
        nama = inputan.next();
        System.out.println("Halo..."+nama+", Selamat Belajar Java");
    }
}
