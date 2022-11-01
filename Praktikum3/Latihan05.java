
import java.util.Scanner;
public class Latihan05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Masukkan rata-rata nilai : ");
        int angka = scan.nextInt();
        
        if(angka > 79){
            System.out.println("Nilai "+angka+" = A");
        }else if(angka > 64){
            System.out.println("Angka "+angka+" = B");
        }else if(angka > 54){
            System.out.println("Angka "+angka+" = C");
        }else if(angka > 44){
            System.out.println("Angka "+angka+" = D"); 
        }else{
            System.out.println("Angka "+angka+" = E");
}
    }
}