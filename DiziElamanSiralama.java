import java.util.Arrays;
import java.util.Scanner;

public class DiziElamanSiralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dizinin boyutunu kullanıcıdan alınıyor
        System.out.print("Dizinin boyutunu girin: ");
        int boyut = scanner.nextInt();

        // Kullanıcıdan alınan boyuta göre dizi oluşturuluyor.
        int[] dizi = new int[boyut];

        // Dizinin elemanlarını kullanıcıdan alınıyor
        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < boyut; i++) {
            System.out.print("Eleman " + (i +1) + ": ");
            dizi[i] = scanner.nextInt();
        }
        // Dizi küçükten büyüğe sıralanıyor,
        Arrays.sort(dizi);
        // Dizi elemanları yazdırılıyor.
        System.out.println(Arrays.toString(dizi));

        // Scanner'ı kapat
        scanner.close();
    }
}