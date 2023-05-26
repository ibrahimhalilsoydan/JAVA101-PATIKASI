import java.util.Scanner;

public class Vucutİndex {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        double kg;
        double  boy;

        System.out.print("Kilonuzu giriniz :");
        kg = input.nextDouble();

        System.out.print("Boyunuzu giriniz(metre cinsinden) :");
        boy = input.nextDouble();
        if (boy >0 && kg>0){
            double index =  kg/(boy*boy);
            System.out.print("Vücut Kitle İndeksiniz : " + index);

        }else {
            System.out.print("Boy ve Kg 0'dan küçük olamaz");
        }

    }
}
