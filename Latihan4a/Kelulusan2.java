import java.util.Scanner;
public class Kelulusan2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda = ");
        String nama=inp.next();
        System.out.print("Masukkan Jenis Kelamin = ");
        String jenis_kelamin=inp.next();
        System.out.print("Masukkan Tinggi Badan = ");
        int tinggi_badan=inp.nextInt();
        if ("Laki-Laki".equals(jenis_kelamin)) {
            if (tinggi_badan > 164) {
                System.out.println("Selamat Anda Lulus");
            } else {
                System.out.println("Anda Gagal");
            }
        } else if ("Perempuan".equals(jenis_kelamin)) {
            if (tinggi_badan > 159) {
                System.out.println("Selamat Anda Lulus");
            } else {
                System.out.println("Anda Gagal");
            }
        }
    }
    
}
