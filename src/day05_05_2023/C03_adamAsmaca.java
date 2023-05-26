package day05_05_2023;

import java.util.Scanner;

public class C03_adamAsmaca {
    /*
    Bu programda, kelimeler adlı bir kelime listesi oluşturulacak.
    Ardından, bu listeden rastgele bir kelime seçmek için Math.random() fonksiyonu kullanılmıştır.
    Kullanıcı, tahmin etmek istediği harfleri girebilir. Tahmin edilen harfler,
    kelimenin doğru harfleriyle yer değiştirilir ve kalan hak sayısı tutulur.
    Tahmin edilen kelimenin her aşaması ekrana yazdırılır.
    Kullanıcının tahmin hakkı bittiğinde, doğru kelime ekrana yazdırılır
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] kelimeler = {"java", "programlama", "selenium", "yazılım", "değişken", "kodlama"};
        String secilenKelime = kelimeler[(int) Math.random() * kelimeler.length];
        int kelimelerlenght = secilenKelime.length();
        System.out.println("Lutfen bir harf girip enter tusuna basiniz.");

        int can = 5;
        String[] tahminEdilenHarfler = new String[secilenKelime.length()];
        for (int i = 0; i < tahminEdilenHarfler.length; i++) {
            tahminEdilenHarfler[i] = "_";

        }
        while (can>0);


    }

}
