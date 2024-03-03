import java.util.Scanner;
import java.util.Arrays;
public class EnYakinSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};

        Arrays.sort(arr);
        int enKucukYakinSAyi=0, enBuyukYakinSayi =0;

        System.out.println("Lütfen sayı giriniz: ");
        int girilensayi = input.nextInt();

        for (int i: arr){

            if (i < girilensayi){
                enKucukYakinSAyi= i;
            }
            if (i> girilensayi){
                enBuyukYakinSayi=i;
                break;
            }
        }
        System.out.println("En yakın en küçük sayı :" +enKucukYakinSAyi);
        System.out.println("En yakın en büyük sayı :" +enBuyukYakinSayi);



    }
}