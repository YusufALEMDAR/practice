package day03_05_2023;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Bankonot {
    //Soru-2) kullanıcının girdiği TL miktarını en az banknot sayısına çeviren programı array kullanarak yapınız.
//int[ ] bankonatlar = {200, 100, 50, 20, 10, 5, 1};
//Örneğin Lütfen Testirlik Maaşınızı TL Olarak Girin: 8642
//Minimum banknot sayısı:
//43 x 200 TL
//2 x 20 TL
//2 x 1 TL
//Toplam Kullanılan Bankonot Sayısı: 47

    public static void main(String[] args) {


        int[ ] bankonatlar = {200, 100, 50, 20, 10, 5, 1};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen Testirlik Maaşınızı TL Olarak Girin");
        int paraMiktari=scanner.nextInt();
        int [] kullanilanBankonot=new int[7];
        // System.out.println(Arrays.toString(kullanilanBankonot));

        for (int i=0;i<bankonatlar.length;i++){   //1520    i=0    200x7   i=1    paramiktar=120   100x1  paramiktaeı=20
            kullanilanBankonot[i]=paraMiktari/bankonatlar[i];  //i=2  i=3
            paraMiktari=paraMiktari%bankonatlar[i];
        }

        System.out.println(Arrays.toString(kullanilanBankonot));
    }


    }

