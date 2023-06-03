import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int mat,fizik,kimya,turkce;
    Scanner inp = new Scanner(System.in);
    System.out.print ("matematik notunuz");
    mat= inp.nextInt();
    System.out.print ("fizik Notunuz");
    fizik= inp.nextInt();
    System.out.print("kimya Notunuz");
            kimya=inp.nextInt();
    System.out.print("turkce Notunuz");
    turkce=inp.nextInt();
    int toplam =(mat+kimya+fizik+turkce);
    double sonuc  = toplam/4;
System.out.println("Ortalamanız:"+sonuc);
    }
}