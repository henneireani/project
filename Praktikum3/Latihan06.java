
import java.util.Scanner;
public class Latihan06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ramalan Zodiak ");
        System.out.println("0. Aries");
        System.out.println("1. Taurus");
        System.out.println("2. Gemini");
        System.out.println("3. Cancer");
        System.out.println("4. Leo");
        System.out.println("5. Virgo");
        System.out.println("6. Libra");
        System.out.println("7. Scorpio");
        System.out.println("8. Sagitarius");
        System.out.println("9. Capricorn");
        System.out.println("10. Aquarius");
        System.out.println("11. Pisces");
        System.out.print("Ketik no zodiak anda : ");
        
        int pilih = scan.nextInt();
        switch(pilih){
            case 0 :
                System.out.println("Aries (21 Mei - 19 April)");
                break;
            case 1 :
                System.out.println("Taurus (20 April – 20 Mei)");
                break;
            case 2 :
                System.out.println("Gemini (21 Mei – 20 Juni)");
                break;
            case 3 :
                System.out.println("Cancer (21 Juni – 22 Juli)");
                break;
            case 4 :
                System.out.println("Leo (23 Juli – 22 Agustus)");
                break;
            case 5 :
                System.out.println("Virgo (23 Agustus – 22 September)");
                break;
            case 6 :
                System.out.println("Libra (23 September–22 Oktober)");
                break;
            case 7 :
                System.out.println("Scorpio (24 Oktober – 21 November)");
                break;
            case 8 :
                System.out.println("Sagitarius (22 November – 21 Desember)");
                break;
            case 9 :
                System.out.println("Capricorn (22 Desember – 19 Januari)");
                break;
            case 10 :
                System.out.println("Aquarius (20 Januari – 18 Februari)");
                break;
            case 11 :
                System.out.println("Pisces (19 Februari – 20 Maret)");
                break;
            default:
                System.out.println("Sistem Error");
                
}
    }
}