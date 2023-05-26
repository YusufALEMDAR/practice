package day01_05_2023;

import java.util.Scanner;

public class C02_ATM_farklıCozum {
    static Scanner scanner = new Scanner(System.in);
    static String userCardNumber="123456";
    static String userPass="project";
    static double balance=2305.67;
    private static byte changePassword() {

        System.out.println("Please enter your new password: ");
        String changePass1=scanner.next();

        System.out.println("Please enter again new password: ");
        String changePass2=scanner.next();

        if(changePass1.equals(changePass2)) {
            System.out.println("Please enter your current password: ");
            String changePassControl=scanner.next();
            if(changePassControl.equals(userPass)) {
                userPass=changePass1;
                System.out.println("Your password has been successfully changed.");
                scanner.nextLine(); // dummy==> scanner.nextInt() ten sonra okunmayan \n i okumak icin koydum.
                login();
                return 6;
            }
            else System.out.println("The password has not been changed because you entered your current password incorrectly.");
        }
        else System.out.println("Passwords entered do not match.");
        return 5;
    }

    private static boolean isIbanValid(String payeeIban) {

        boolean validation=false;
        payeeIban=payeeIban.trim().replaceAll("\\s+","").replaceAll("\\W","");

        // payeeIban.substring(0,2).equals("TR") de kullanilabilir.
        if(payeeIban.startsWith("TR") && payeeIban.length()==26) {

            if (payeeIban.substring(2, 26).replaceAll("\\D", "").equals(payeeIban.substring(2, 26)))
                validation=true;
        }
        return validation;
    }

    private static void transferMoney() {

        scanner.nextLine(); // dummy==> scanner.nextInt() ten sonra okunmayan \n i okumak icin koydum.
        System.out.println("Please enter the payee's IBAN (International Bank Account Number): ");
        String payeeIban=scanner.nextLine().toUpperCase();
        if (isIbanValid(payeeIban)) {

            System.out.println("Please enter the transfer amount: ");
            double transferAmount=scanner.nextDouble();
            if (transferAmount>balance)
                System.out.println("Not possible transaction. Your balance is insufficient.");
            else {
                System.out.println("Money is transferring");
                balance-=transferAmount;
                System.out.println(+transferAmount+" units have been transfer from your account.");
                balanceLearning();
            }
        }
        else {
            System.out.println("You entered invalid IBAN");
            userMenu();
        }
    }

    private static void withdrawAmount() {
        System.out.println("Please enter the withdraw amount: ");
        double withdraw=scanner.nextDouble();
        if (withdraw>balance)
            System.out.println("Not possible transaction. Your balance is insufficient.");
        else {
            System.out.println("Money is being prepaid.");
            balance-=withdraw;
            System.out.println(+withdraw+" units have been withdrawn from your account.");
            balanceLearning();
        }
    }

    private static void depositAmount() {
        double deposit;
        System.out.println("Please enter the deposit amount: ");
        deposit=scanner.nextDouble();
        balance+=deposit;
        balanceLearning();
    }

    private static void balanceLearning() {

        System.out.println("Your balance is: "+balance);
    }

    public static void userMenu() {

        byte numberOfTansaction;
        do {

            System.out.println("\nPlease Select Your Transaction");
            System.out.println("1-Balance\n2-Deposit\n3-Withdraw\n4-Transfer\n5-Password Change\n6-Exit");
            numberOfTansaction=scanner.nextByte();

            switch (numberOfTansaction) {

                case 1: balanceLearning(); break;
                case 2: depositAmount(); break;
                case 3: withdrawAmount(); break;
                case 4: transferMoney(); break;
                case 5: numberOfTansaction=changePassword(); break;
                case 6:
                    System.out.println("Checking out."); break;
                //System.exit(0); // Derleyici bu satira geldiginde calismayi bitirir.
                default:
                    System.out.println("Please make a valid entry."); break;
            }
        } while(numberOfTansaction!=6);//
    }

    private static void login() {

        String cardNumber=null;
        String pass=null;

        int attempt=3;

        while (attempt>0){

            System.out.println("Please enter your card number: ");
            cardNumber = scanner.nextLine().replaceAll("\\s+","");

            System.out.println("Please enter your password: ");
            pass = scanner.nextLine().trim();

            if (cardNumber.equals(userCardNumber) && pass.equals(userPass)) {

                System.out.println("Login successful.");
                userMenu();
                attempt=0;

            } else {
                System.out.println("You entered the card number or password incorrectly. You have "+(--attempt)+" attempts left.");
            }
        }

    }

    public static void main(String[] args) {
        login();

    }

}
