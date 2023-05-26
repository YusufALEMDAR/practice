package day05_05_2023;

import java.util.Scanner;

public class nextLineAtlamaSorunu_dummy {

    public static void main(String[] args) {

        Scanner mb = new Scanner(System.in);  //Scanner oluşturduk "mb" ye istediğimiz isim verilir
        System.out.print("Adınızı ve soyadınızı giriniz: ");
        String name = mb.nextLine();

        System.out.print("Lutfen yasinizi giriniz: ");
        int age=mb.nextInt();

        // Satır sonu ara bellekte kalan bosluk kullanılmalıdır.
        // Bunun icin bos bir nextLine kullanılarak sorun cozuluyor
        mb.nextLine(); //dummy

        System.out.print("Lutfen mesleginizi giriniz: ");
        String job=mb.nextLine();

        //mb.close(); // Scanner burada kapanıyor anlamında bundan sonra yeni Scanner tanımlanmalı anlamına geliyor
        // white box testi: kodların çalışıp çalışmadığının test edilmesi
    }

}
