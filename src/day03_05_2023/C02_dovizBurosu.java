package day03_05_2023;

import java.util.Scanner;

public class C02_dovizBurosu {
    //Soru-3) Döviz almak ya da satmak isteyen kullanıcıyı once aşağıdaki gibi bir menuyle karşılayıp kullanıcının secim yapıp
//işlemlerini girisMenu() metodu ile, doviz alımı için dovizAlim() metodu ile, döviz satışı için dovizSatıs() metodu ile
//toplamda 3 method kullanarak yapınız.
//***********QA DOVİZ***************
//         Alış              Satış
//Dolar:   20.67              19.9
//Euro:    20.67              21.27
//--------------------------------------
//Doviz Alımı Yapmak İçin (1)'e Basınız :
//Doviz Satışı Yapmak İçin (2)'e Basınız :

    static Scanner scanner = new Scanner(System.in);
    static double kurDolarAlıs=20.28;
    static double kurDolarSatıs=20.58;
    static double kurEuroAlıs=22.26;
    static double kurEuroSatıs=22.66;



    public static void main(String[] args) {
        girisMunu();


    }
    public static void girisMunu() {
        System.out.println("******************QA DOVİZ**************\n" +
                "\t\t\tAlış \t\t Satış\n" +
                "Dolar:\t\t" + 20.67 + "\t\t" + 19.9 + "\n" +
                "Euro:\t\t" + 20.97 + "\t\t" + 21.27);
        System.out.println("--------------------------------------------"); //ctrl+alt+l
        System.out.println("Doviz Alımı Yapmak İçin (1)'e Basınız :");
        System.out.println("Doviz Satışı Yapmak İçin (2)'e Basınız :");
        int secim=scanner.nextInt();
        if (secim==1){
            dovizAlim();
        } else if (secim==2) {
            dovizSatis();
        }else {
            System.out.println("Hatalı giriş yaptınız...Lütfen tekrar giriş yapınız");
            girisMunu();
        }

    }

    public static void dovizAlim() {
        System.out.println("dolar almak için D Euro almak için E  basınız:");
        Character dovizSecim=scanner.next().toUpperCase().charAt(0);
        if (dovizSecim.equals('D')){
            System.out.println("Tl miktarınızı giriniz:");
            int tl=scanner.nextInt();
            double dolar=tl/kurDolarAlıs;
            System.out.println(tl+" TL ile "+dolar+" alabilirsiniz.");

        } else if (dovizSecim.equals('E')) {
            System.out.println("Tl miktarınızı giriniz:");
            int tl=scanner.nextInt();
            double euro=tl/kurEuroAlıs;
            System.out.println(tl+" TL ile "+euro+" alabilirsiniz.");


        }else {
            System.out.println("hatalı secim yaptınız Lütfen tekrar deneyiniz: ");
            dovizAlim();
        }

    }

    public static void dovizSatis() {

        System.out.println("dolar satma için D Euro satmak için E  basınız:");
        Character dovizSecim=scanner.next().toUpperCase().charAt(0);
        if (dovizSecim.equals('D')){
            System.out.println("Dolar miktarınızı giriniz:");
            double dolar=scanner.nextDouble();
            double tl=dolar*kurDolarSatıs;
            System.out.println(dolar+" dolar "+tl+" eder");

        } else if (dovizSecim.equals('E')) {
            System.out.println("Euro miktarınızı giriniz:");
            int euro=scanner.nextInt();
            double tl=euro*kurEuroSatıs;
            System.out.println(euro+" euro "+tl+" eder.");


        }else {
            System.out.println("hatalı secim yaptınız Lütfen tekrar deneyiniz: ");
            dovizSatis();
        }
    }
}
