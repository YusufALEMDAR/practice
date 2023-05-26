package day05_05_2023;

import java.util.Random;
import java.util.Scanner;

public class C02_tasKagitMakas_farkliCozum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rndm = new Random();

        int userChoice = 0;
        int compChoice = 0;
        int userPoint = 0;
        int compPoint = 0;
        String[] tercihler = {"tas", "kagit", "makas"};


        do {
            System.out.println("Lutfen secim yapiniz : \n1-Tas \n2-Kagit \n3-Makas");

            //Kullanicinin secimini iste.
            userChoice = scan.nextInt();

            //Bilgisayar icin random bir deger uretecegiz
            compChoice = rndm.nextInt(3) + 1; //0-3 arasi  0 dahil 3 haric bir deger uretecegi icin +1 dedik.

            System.out.println("Bilgisayarin sectigi :" + tercihler[compChoice - 1]);
            System.out.println("");


            if (userChoice == 1 && compChoice == 2) {

                System.out.println("Kagit tasi sarar--Bilgisayar kazandi");
                compPoint++;
            } else if (userChoice == 1 && compChoice == 3) {

                System.out.println("Tas makasi kirar--Siz kazandiniz");
                userPoint++;
            } else if (userChoice == 2 && compChoice == 1) {

                System.out.println("Kagit tasi sarar--Siz kazandiniz");
                userPoint++;
            } else if (userChoice == 2 && compChoice == 3) {


                System.out.println("Makas kagidi keser--Bilgisayar kazandi");
                compPoint++;
            }

            else if (userChoice == 3 && compChoice == 1) {

                System.out.println("Tas makasi kirar--Bilgisayar kazandi");
                compPoint++;

            } else if (userChoice == 3 && compChoice == 2) {

                System.out.println("Makas kagidi keser--Siz kazandiniz");
                userPoint++;
            }
            System.out.println("Sizin puaniniz : " + userPoint + "\nBilgisayarin puani : " + compPoint);
            System.out.println("");

        } while (userPoint != 5 && compPoint != 5);

        if (userPoint > compPoint) {
            System.out.println("Tebrikler siz kazandiniz");
        } else {
            System.out.println("Maalesef kaybettiniz.");
        }
        System.err.println("Oyun bitti!");
    }}
