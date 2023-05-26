package day05_05_2023;

public class Continue_err {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {

            if (i == 3) {

                continue; //atlamamı istedigimiz kismi atlatıyor 3 atladı burada

            }
            System.out.println("");

            System.out.print(i + "");
        }
        System.err.println("İslem tamam"); // en son yazdıracagimiz "err" yazınca kızmızı yazar
    }

}
