import java.util.Scanner;

public class CinZodyag {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dogumYili,modSonuc;

        System.out.print("Doğum yılınızı giriniz :");
        dogumYili= input.nextInt();

        modSonuc = dogumYili % 12;

        switch (modSonuc){
            case 0:
                System.out.print("Çin Zodyağınız : Maymun");
                break;
            case 1:
                System.out.print("Çin Zodyağınız : Horoz");
                break;
            case 2:
                System.out.print("Çin Zodyağınız : Köpek");
                break;
            case 3:
                System.out.print("Çin Zodyağınız :Domuz");
                break;
            case 4:
                System.out.print("Çin Zodyağınız :Fare");
                break;
            case 5:
                System.out.print("Çin Zodyağınız :Öküz");
                break;
            case 6:
                System.out.print("Çin Zodyağınız :Kaplan");
                break;
            case 7:
                System.out.print("Çin Zodyağınız :Tavşan");
                break;
            case 8:
                System.out.print("Çin Zodyağınız :Ejderha");
                break;
            case 9:
                System.out.print("Çin Zodyağınız :Yılan");
                break;
            case 10:
                System.out.print("Çin Zodyağınız :At");
                break;
            case 11:
                System.out.print("Çin Zodyağınız :Koyun");
                break;
        }

    }
}