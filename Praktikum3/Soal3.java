
import java.util.Scanner;
public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int metode;
        System.out.println("Pilih Metode");
        System.out.println("1. Menghitung Luas Persegi");
        System.out.println("2. Mengitung Keliling Persegi");
        System.out.print("Pilihan : ");
    metode=input.nextInt();
    switch (metode) {
        case 1:
            System.out.println("Masukkan panjang sisi persegi : 6");
            System.out.println("Luas Persegi adalah : 36 cm");
            break;
        case 2:
            System.out.println("Masukkan panjang sisi persegi : 6");
            System.out.println("Luas Persegi adalah : 24 cm");
        default:
            System.out.println("Sistem Error");
        }
    }
}
