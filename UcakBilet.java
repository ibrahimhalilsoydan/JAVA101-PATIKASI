import java.util.Scanner;

public class UcakBilet {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int ucusMesafesi, yas, ucusTipi;

        double biletFiyati=0,kmUcreti=0.10, cocukIndrim=0.50,gencIndirimi=0.10,yasliIndirim=0.30,ciftYonIndirim=0.20,
                normalFiyat=0, indirmliFiyat=0;

            //  VERİLERİ ALIYORUZ**************************************************

        System.out.print("Uçuş mesafesini(Km) giriniz : ");
        ucusMesafesi= input.nextInt();
        System.out.print("Yaşınızı Giriniz :");
        yas =input.nextInt();
        System.out.print("Uçuş tipini seçiniz :\n 1. Tek Yön\n 2.Gidiş-Dönüş\n Uçuş tipi tercihiniz : ");
        ucusTipi=input.nextInt();

        normalFiyat=ucusMesafesi*kmUcreti;//NORMAL FİYAT HESABINI BİR DEĞİŞKENE ATADIK*************

        if (ucusMesafesi>0) {// UÇUŞ MESAFESİNİN NEGATİF OLAMASI İÇİN KOŞUL GİRDİK*******

            if (ucusTipi == 1 || ucusTipi == 2) {

                if (yas>0) {// YAŞ İÇİN POZİTİF KOŞULU SAĞLANDI*************

                    if (yas > 0 && yas < 12) {// SIRAYLA İSTENEN YAŞ KOŞULLARINI SAĞLADIK VE FİYAT HESABI İÇİN ATAMALAR VE İŞLEMLAR YAPTIK********

                        indirmliFiyat = normalFiyat * cocukIndrim;
                        biletFiyati = normalFiyat - indirmliFiyat;
                    } else if (yas >= 12 && yas <= 24) {
                        indirmliFiyat = normalFiyat * gencIndirimi;
                        biletFiyati = normalFiyat - indirmliFiyat;
                    } else if (yas > 65) {
                        indirmliFiyat = normalFiyat * yasliIndirim;
                        biletFiyati = normalFiyat - indirmliFiyat;
                    } else {
                        biletFiyati = normalFiyat;
                    }
                }else {System.out.print("Hatalı veri girişi!!! Yaş 0 dan büyük olmak zorunda .."); return;}

                    // EN SON ATANANMIŞ DEGERE SAHİP FİYAT DEĞİŞKENİNİ UÇUŞ TİPLERİNİ SORGULADIKTAN GONRA 2. TİPİ SEÇENLERİ İÇİN GEREKLİ İNDİRİM İŞLEMİNİ YAPTIK

                biletFiyati = (ucusTipi == 2) ? (biletFiyati - (biletFiyati * ciftYonIndirim)) * 2 : biletFiyati;

                System.out.print("Toplam Tutar "+biletFiyati+" TL 'dir.. \nİyi yolculuklar dileriz...");
            } else {
                System.out.print("Hatalı veri giriş !!! Uçuş Tipi İçin sadece 1(tek yön) - 2(Gidiş Dönüş) Seçeneklerini tercih edebilirsiniz...");
            }
        }else {System.out.print("Hatalı Veri Girişi !!! Uçuş mesafesi 1 km'den küçük olamaz..");}
    }
}