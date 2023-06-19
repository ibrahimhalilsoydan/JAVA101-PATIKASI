import java.util.Scanner;

public class RecursivePower {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri  giriniz : ");
        int taban =input.nextInt();
        System.out.print("Üs değeri  giriniz : ");
        int us = input.nextInt();
        input.close();

        int sonuc = usluSayiHesaplama(taban,us);
        System.out.print("Sonuç : "+ sonuc);
    }

    private static int usluSayiHesaplama(int taban, int us) {
        if (us==0){
            return  1;
        }else {
            return taban * usluSayiHesaplama(taban, us-1);
        }
    }
}
