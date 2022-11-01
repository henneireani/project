import java.util.Scanner;
public class Latihan4Penjumlahan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai1 = ");
        int nilai1 = input.nextInt();
        
        System.out.print("Masukkan nilai2 = ");
        int nilai2 = input.nextInt();
        
        // Hitung dan Print
        
        int jumlah = nilai1 + nilai2;
        System.out.println("Jumlah = " + jumlah);
}
}