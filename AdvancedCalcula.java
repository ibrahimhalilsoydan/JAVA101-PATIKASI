import  java.util.Scanner;

public class AdvancedCalcula {

    static int sum(int a,int b){
        int result = a + b;
        System.out.println("Toplama Sonucu :" + result);
        return result;
    }
    static int minus(int a, int b){
        int result= a - b;
        System.out.println("Çıkarma Sonucu :"+ result);
        return result;
    }
    static int times (int a, int b){
        int result = a * b;
        System.out.println("Çarpma Sonucu :"+ result);
        return result;

    }
    static int divided(int a, int b){
        if(b == 0 ){
            System.out.println("İkinci sayı 0 dan farklı olmalı");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölme Sonucu :"+ result);
        return result;
    }

    static int power (int a, int b){
        int result =1;
        for (int i =1; i<= b; i++){
            result *= a;
        }
        System.out.println("Üs alma Sonucu : "+result);
        return result;

    }

    static int mod (int a, int b){
        int result = a % b;
        System.out.println("Mod Sonucu : "+ result);
        return result;
    }
    static void rectangle(int a, int  b){
        System.out.println("Çevresi : "+ (2*(a+b)));
        System.out.println("Alanı : "+ (a*b));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1 -Toplama işlemi\n"
                        +"2 -Çıkarma işlemi\n"
                        +"3 -Çarpma işlemi\n"
                        +"4 -Bölme işlemi\n"
                        +"5 -Üslü sayı hesaplam\n"
                        +"6 -Mod alma\n"
                        +"7 -Dikdörtgen Alan ve Çevre Hesabı\n"
                        +"0 -Çıkış yap";
        System.out.println(menu);
        while ( true){

            System.out.print("Yapılacak işlemi seçiniz : ");
            select=input.nextInt();
            if (select==0){
                break;
            }
            System.out.print("Birinci Sayıyı Giriniz :");
            int a = input.nextInt();
            System.out.print("İkinci Sayıyı Giriniz :");
            int b = input.nextInt();

            switch (select){
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divided(a,b);
                    break;
                case 5:
                    power(a,b);
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    rectangle(a,b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem seçtiniz ...");
            }
        }
         System.out.println(" Çıkış yaptınız . İyi günler...");
    }
}