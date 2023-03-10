package com.conpany.AtmProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AtmOperationInterf op = new AtmOperationImp();

        int atmnumber = 12345;
        int atmpin = 123;

        Scanner scannerIn = new Scanner(System.in);
        System.out.println("*** Welcome to Atm Machine ***");

        System.out.println("Enter Atm Number :");
        int atmNumber = scannerIn.nextInt();
        System.out.println("Enter Pin :");
        int pin = scannerIn.nextInt();
        if ((atmnumber == atmNumber) && (atmpin == pin)) {
            while (true) {
                System.out.println(
                                "1.View Available Balance\n" +
                                "2.Withdraw Amount\n" +
                                "3.Deposit Amount\n" +
                                "4.View Mini statement\n" +
                                "5.Exit");
                System.out.println("Enter Choise");
                int choise = scannerIn.nextInt();
                if (choise == 1) {
                    op.viewBalance();
                } else if (choise == 2) {
                    System.out.println("Enter amount to withdraw");
                    double withdrawAmount = scannerIn.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                } else if (choise == 3) {
                    System.out.println("Enter Amount to Deposit :");
                    double depositAmount = scannerIn.nextDouble(); // 5000
                    op.depositAmount(depositAmount);
                } else if (choise == 4) {
                    op.viewMiniStatement();
                } else if (choise == 5) {
                    System.out.println("        Collect your Atm Card\n" +
                            " *** Thank you for Atm Machine ***");
                    System.exit(0);
                } else {
                    System.out.println("Please enter correct choice");
                }
            }
        } else {
            System.out.println("Incorrect Atm Number on pin");
            System.exit(0);
        }

    }
}
