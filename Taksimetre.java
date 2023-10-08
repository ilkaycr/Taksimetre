package TemelKavramlar;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int km;
        double kmbasiucret = 2.20 , toplam , acilis=10.0;



        //Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km cinsinder giriniz :  ");
        km = input.nextInt();

        toplam = (km * kmbasiucret);
        toplam += acilis;

        toplam = (toplam < 20 ) ? 20 : toplam ;
        System.out.println("Toplam Tutar : " + toplam );


    }
}
