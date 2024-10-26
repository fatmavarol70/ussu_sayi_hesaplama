package örnek;

import java.util.Scanner;

public class üssü_sayı_hesaplama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sayı1,sayı2,sonuc=1;
        System.out.println("üssü alınacak sayı:");
        sayı1 = sc.nextInt();
        System.out.println("üs olacak sayı");
        sayı2 = sc.nextInt();

        int i=1;
        while (i<=sayı2){
            sonuc=sonuc*sayı1;
            i++;
        }
        System.out.println("Sonuc:"+sonuc);
    }
}
