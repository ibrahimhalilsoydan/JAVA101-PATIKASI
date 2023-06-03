import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int perfect,result=0;

        System.out.print("Bir Syı Giriniz: ");
        perfect=input.nextInt();


        for (int i= 1; i<perfect; i++){
            if(perfect%i==0){
                result+=i;
            }
        }
        if (result==perfect){
            System.out.print(perfect +"- Bir Mükemmel Sayıdır..");
        }else {
            System.out.print(perfect+"- Bir Mükemmel Sayı Degilir..");
        }
    }
}