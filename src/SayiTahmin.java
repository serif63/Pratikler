import java.util.Scanner;
public class SayiTahmin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi = (int) (Math.random() * 100);
        System.out.println(sayi);

        int hak = 0;

        while (hak < 5) {
            System.out.print("1 ile 100 Arasındaki Tahmin Edilen Sayıyı Giriniz:");
            int tahmin = input.nextInt();
            hak++;
            if (tahmin < 0 || tahmin > 100) {
                System.out.println("Lütfen 1 ile 100 arasında bir değğer giriniz");
                continue;
            }
            if (sayi == tahmin) {
                System.out.print("Tebrikler " + sayi + " sayısını buldunuz");
                break;
            } else if (tahmin < sayi) {
                System.out.println("Tahmin ettiğiniz sayı bulmanız gereken sayıden küçüktür ");
                System.out.println(5-hak+" Hakkınız Kaldı");
            } else if (tahmin > sayi) {
                System.out.println("Tahmin ettiğiniz sayı bulmanız gereken sayıden büyüktür. ");
                System.out.println(5-hak+" Hakkınız Kaldı");

            }


        }
        if(hak==5){
            System.out.println("Hakkınız  dolmuştur maalesef bulamadınız" );
        }
    }
}
