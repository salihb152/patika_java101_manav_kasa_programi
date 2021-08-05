import java.util.Scanner;
public class Main {
    public static void main(String[] args)  {
        double fiyatArmut=2.14, fiyatElma=3.67, fiyatDomates=1.11, fiyatMuz=0.95, fiyatPatlıcan=5.0;
        int kiloArmut, kiloElma, kiloDomates, kiloMuz, kiloPatlıcan;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        kiloArmut= scanner.nextInt();
        System.out.print("Elma Kaç Kilo ? : ");
        kiloElma= scanner.nextInt();
        System.out.print("Domates Kaç Kilo ? : ");
        kiloDomates= scanner.nextInt();
        System.out.print("Muz Kaç Kilo ? : ");
        kiloMuz= scanner.nextInt();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        kiloPatlıcan= scanner.nextInt();
        double toplamTutar=(kiloArmut*fiyatArmut)+(kiloDomates*fiyatDomates)+(kiloElma*fiyatElma)+(kiloMuz*fiyatMuz)+(kiloPatlıcan*fiyatPatlıcan);
        System.out.print("Toplam Tutar : "+ toplamTutar+ " TL");

    }
}
