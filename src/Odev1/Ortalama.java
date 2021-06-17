package Odev1;
import java.util.Scanner;

public class Ortalama {

    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik notunu giriniz: ");
        mat=inp.nextInt();

        System.out.print("Fizik notunu giriniz: ");
        fizik=inp.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        kimya = inp.nextInt();

        System.out.print("Turkce notunu giriniz: ");
        turkce=inp.nextInt();

        System.out.print("Tarih notunu giriniz: ");
        tarih=inp.nextInt();

        System.out.print("Muzik notunu giriniz: ");
        muzik=inp.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc=toplam/6.0;

        System.out.println("Notlarin ortalamasi: "+sonuc);
        String durum = sonuc > 60 ? "Gectiniz" : "Kaldiniz";
        System.out.println(durum);

    }
}