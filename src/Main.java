import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        final  double armutFiyat  = 2.14;
        final  double elmaFiyat  = 3.67;
        final  double domatesFiyat  = 1.11;
        final  double muzFiyat = 0.95;
        final  double patlıcanFiyat  = 5.00;
        double toplam =0;


        System.out.print("Aldığınız Armut Miktarını Yazınız: ");
        double armutKG = scanner.nextDouble();
        System.out.print("Aldığınız Elma Miktarını  Yazınız: ");
        double elmaKG = scanner.nextDouble();
        System.out.print("Aldığınız Domates Miktarını Yazınız: ");
        double domatesKG = scanner.nextDouble();
        System.out.print("Aldığınız Muz Miktarını Yazınız: ");
        double muzKG = scanner.nextDouble();
        System.out.print("Aldığınız  Miktarını Yazınız: ");
        double patlıcanKG = scanner.nextDouble();

        toplam = (armutFiyat * armutKG) + (elmaFiyat * elmaKG) +
                (domatesKG * domatesFiyat) * (muzKG * muzFiyat)+
                (patlıcanKG + patlıcanFiyat);

        System.out.println("Toplam Tutar: "+ toplam + " TL");












    }
}