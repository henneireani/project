/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        String nama, kelas;
        int nim, smt;
        Scanner inputan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Masukkan Nama     : ");
        nama = inputan.next();
        System.out.print("Masukkan NIM      : ");
        nim = inputan.nextInt();
        System.out.print("Masukkan Semester : ");
        smt = inputan.nextInt();
        System.out.print("Masukkan Kelas    : ");
        kelas = inputan.next();
        System.out.println("-----Hasil-----");
        System.out.println("Nama            : "+nama);
        System.out.println("NIM             : "+nim);
        System.out.println("Semester        : "+smt);
        System.out.println("Kelas           : "+kelas);
    }
}
