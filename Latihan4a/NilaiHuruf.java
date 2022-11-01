
import java.util.Scanner;
public class NilaiHuruf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Masukkan angka untuk di konversikan ke huruf : ");
        int angka = scan.nextInt();
        
        if(angka > 85){
            System.out.println("Angka "+angka+" = A");
        }else if(angka > 75){
            System.out.println("Angka "+angka+" = B");
        }else if(angka > 65){
            System.out.println("Angka "+angka+" = C");
        }else if(angka > 55){
            System.out.println("Angka "+angka+" = D"); 
        }else{
            System.out.println("Angka "+angka+" = Error");
}
    }
}