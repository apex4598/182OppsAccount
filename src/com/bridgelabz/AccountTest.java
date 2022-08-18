package com.bridgelabz;

import java.util.Scanner;

public class AccountTest {

    public static final int DISPlAY =1;
    public static final int EXIT =2;

    public static void main(String[] args) {
        System.out.println("Welcome to Account Management System");
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of accounts to create");
        int n = sc.nextInt();
        Account[] account = new Account[n];

        for (int i = 0; i < account.length; i++) {
            account[i] = new Account();
            account[i].openAccount();

            int option;
            String accountNumber = sc.next();
            boolean found = false;

            System.out.println("Select option:\n1. Display All\n 2. Exit");
            option = sc.nextInt();
            switch (option) {
                case DISPlAY:
                    for (Account element : account) {
                        element.showAccount();
                    }
                    break;

                case EXIT:
                    System.exit(0);
                default:
                    System.out.println("Choose a valid option");
            }
        }
    }

    }
}
