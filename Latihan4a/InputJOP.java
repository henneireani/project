import javax.swing.JOptionPane;

public class InputJOP {
    public static void main(String[] args) {
        // Input Nama
        String nama = JOptionPane.showInputDialog("Masukkan nama anda!");

        int umur = Integer.parseInt(JOptionPane.showInputDialog("Masukkan umur anda!"));
        // Print
        System.out.println("Hai " + nama + ", apa kabar? Tidak terasa sekarang anda sudah " + umur + " tahun.");
    }
}
