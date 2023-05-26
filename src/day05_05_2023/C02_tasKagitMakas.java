package day05_05_2023;

import java.util.Random;
import java.util.Scanner;

public class C02_tasKagitMakas {

    //bilgisayara karsi tas kagit makas oyunu
    //5 puana ulasan kazansın ve oyun bitsin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random(); // bilgiyarın aalacağı deger

        int userChoice = 0; //Choice=seçenek
        int compChoice = 0;
        int userPoint = 0;
        int copmPoint = 0;

        do {
            System.out.println("Lutfen secim yapiniz:\n1-Tas \n2-Kagit \n3-Makas");
            //Kullanıcının secimini isteyecegiz
            userChoice = scan.nextInt(); //userChoise yi kullanıcıdan aldık

            // Bilgisayar icin random deger alacagiz
            compChoice = rnd.nextInt(3) + 1; // 0-3 arası bir deger üretecgi icin +1 dedik
            if (userChoice == 1 && compChoice == 2) {
                System.out.println("Bilgisayarın sectigi: " + compChoice);
                System.out.println("");
                System.out.println("Kagit tasi sarar -- bilgisaya kazandı");
                copmPoint++;
                System.out.println("sizin puanınız: " + userPoint + "\n Bilgisayrın puanı: " + copmPoint);
                System.out.println("");
            } else if (userChoice == 1 && compChoice == 3) {
                System.out.println("Bilgisayarın sectigi: " + compChoice);
                System.out.println("");
                System.out.println("tas makasi kirar --- siz kazandiniz");
                userPoint++;
                System.out.println("sizin puanını: " + userPoint + "\nbilgisayar puanı: " + copmPoint);
                System.out.println("");

            } else if (userChoice == 2 && compChoice == 1) {
                System.out.println("Bilgisayarın sectigi: " + compChoice);
                System.out.println("");
                System.out.println("Kagit tasi sarar-- siz kazandiniz");
                userPoint++;
                System.out.println("Sizin puanınız: " + userPoint + "\nBilgisayarın puanı: " + copmPoint);
                System.out.println("");

            } else if (userChoice == 2 && compChoice == 3) {
                System.out.println("Makas kagidi keser--- bilgisayar kazandi");
                System.out.println("");
                System.out.println("makas kagidi keser -- blgisayar kazandi");
                copmPoint++;
                System.out.println("sizin puanınız: " + userPoint + "\n Bilgisyar puanı: " + copmPoint);
                System.out.println("");

            } else if (userChoice == 3 && compChoice == 1) {
                System.out.println("Bilgisayarın sectigi: " + compChoice);
                System.out.println("");
                System.out.println("tas makasi kirar --- bilgisayar kazandi");
                copmPoint++;
                System.out.println("sizin puanınız: " + userPoint + "\n bilgisayarın puanı: " + copmPoint);
                System.out.println("");

            } else if (userChoice == 3 && compChoice == 2) {
                System.out.println("Bilgisayarın sectigi: " + compChoice);
                System.out.println("");
                System.out.println("Makas kagidi keser -- siz kazandiniz");
                userPoint++;
                System.out.println("");
                System.out.println("sizin puanınız: " + userPoint + "\n bilgisayarın puanı: " + copmPoint);
                System.out.println("");


            }else {
                System.out.println("Bilgisyar sizinle aynı seyi secti kimse puan alamadı");
                System.out.println("sizin puanınız: " + userPoint + "\n bilgisayarın puanı: " + copmPoint);
                System.out.println("");

            }


        }while (userPoint!=5 && copmPoint!=5);
        if (userPoint>copmPoint){
            System.out.println("Tebrikler siz kazandiniz");
        }else {
            System.out.println("Maalesef kaybettiniz-- bilgisayar kazandi");
        }
        System.err.println("oyun bitti");

    }


}
