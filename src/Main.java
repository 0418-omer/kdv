import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar, kdvoran, kdvlifiyat, kdvtutar ;
        System.out.println("Tutar giriniz = ");
        tutar = input.nextInt();
        if (tutar <= 1000){
            kdvoran = 0.18;
            kdvtutar = tutar * kdvoran;
            kdvlifiyat = tutar + kdvtutar;
            System.out.println("KDV'siz tutar = "+tutar);
            System.out.println("KDV oranı = "+kdvoran);
            System.out.println("KDV tutarı = "+kdvtutar);
            System.out.println("KDV'li fiyat = "+kdvlifiyat);
        }
        else {
            kdvoran = 0.08;
            kdvtutar = tutar * kdvoran;
            kdvlifiyat = tutar + kdvtutar;
            System.out.println("KDV'siz tutar = "+tutar);
            System.out.println("KDV oranı = "+kdvoran);
            System.out.println("KDV tutarı = "+kdvtutar);
            System.out.println("KDV'li fiyat = "+kdvlifiyat);

        }


    }
}