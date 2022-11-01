
import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        int belanja;
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Total Belanjaan: Rp ");
        belanja = scan.nextInt();
        if ( belanja > 100000 ){
            System.out.println("Selamat, anda mendapatkan diskon!");
        }
        System.out.println("Terima Kasih...");
    }
}
