import java.util.Scanner;
public class BobotNilaiHuruf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pilih huruf untuk dikonversikan?");
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        System.out.println("D");
        System.out.println("E");
        System.out.print("Ketik huruf = ");
        char pilih = scan.next().charAt(0);
        switch (pilih){
            case 'A':
                System.out.println("4");
                break;
            case 'B':
                System.out.println("3");
                break;
            case 'C':
                System.out.println("2");
                break;
            case 'D':
                System.out.println("1");
                break;
            case 'E':
                System.out.println("0");
                break;
            default:
                System.out.println("Sistem Error");
        }
    }
}
