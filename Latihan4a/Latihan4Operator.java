
import javax.swing.JOptionPane;
public class Latihan4Operator {
    public static void main(String[] args) {
        int a,b,c;
        String str=JOptionPane.showInputDialog("Masukkan Nilai a = ");
        a = Integer.parseInt(str);
        String jdr=JOptionPane.showInputDialog("Masukkan Nilai b = ");
        b = Integer.parseInt(jdr);
        String rdr=JOptionPane.showInputDialog("Masukkan Nilai c = ");
        c = Integer.parseInt(rdr);
        
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        
        boolean d= a>b;
        boolean e= a<b;
        boolean f= a==c;
        boolean g= b>c;
        boolean h= b<c;
        boolean i= a==b;
        
        boolean and = d && e;
        boolean andd = f && g;
        boolean anddd = h && i;
        
        boolean or = d || e;
        boolean orr = f || g;
        boolean orrr = h || i;
        
        boolean xor = d ^ e;
        boolean xorr = f ^ g;
        boolean xorrr = h ^ i;
        
        boolean not = !d;
        boolean nott = !f;
        boolean nottt = !h;
        
        System.out.println(and);
        System.out.println(andd);
        System.out.println(anddd);
        
        System.out.println(or);
        System.out.println(orr);
        System.out.println(orrr);
        
        System.out.println(xor);
        System.out.println(xorr);
        System.out.println(xorrr);
        
        System.out.println(not);
        System.out.println(nott);
        System.out.println(nottt);
    }
}
