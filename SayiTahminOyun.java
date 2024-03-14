import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyun {
    public static void main(String[] args) {

        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);

        int rightHak =0;
        int selectedSecim;
        int [] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;


        while (rightHak < 5){
            System.out.println("Lütfen tahmininizi giriniz :");
            selectedSecim = input.nextInt();

            if (selectedSecim < 0 || selectedSecim >99){
                System.out.println("Lütfen 0- 100 arasında bir deger giriniz.");
                if (isWrong){
                    rightHak++;
                    System.out.println("Çok fazla hatalı giriş yaptınız . kalan hak: "+(5-rightHak));
                }else {
                    isWrong = true;
                    System.out.println("bir sonraki hatalı girişte , tahmin hakkınızdan düşülecektir.");
                }
                continue;
            }
            if (selectedSecim == number){
                System.out.println("Tebrikler, doğru tahmin ettiniz:) Gizli sayı :"+number);
                isWin=true;
                break;
            }else {

                System.out.println("Hatalı bir sayı girdiniz");
                if (selectedSecim >number){
                    System.out.println("Tahmininiz gizli sayıdan büyütür.");
                }else {
                    System.out.println("Tahimimininiz gizli sayıdan küçüktür.");
                }
                wrong[rightHak++]=selectedSecim;

                System.out.println("Kalan cevap hakkınız: "+(5-rightHak));
            }
        }
        if (!isWin ){
            System.out.println("Kaybettiniz ! ");
            System.out.println("Gizli sayı :"+number);

            if (!isWrong){
               System.out.println("Tehminleriniz : "+ Arrays.toString(wrong));
           }

        }
    }
}