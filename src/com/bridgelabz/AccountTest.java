package com.bridgelabz;

import java.util.Scanner;

public class AccountTest {

    public static final int DISPlAY = 1;
    public static final int EXIT = 5 ;
    public static final int SEARCH = 2;
    public static final int DEPOSIT  = 3;
    public static final int WITHDRAWAL = 4;

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

            System.out.println(" Select option: \n1. Display All \n2. Search by Account\n 3. Deposit 4. Withdrawal 5. Exit");
            option = sc.nextInt();
            switch (option) {
                case DISPlAY:
                    for (Account element : account) {
                        element.showAccount();
                    }
                    break;
                case SEARCH:
                    System.out.print("Enter the account number ");
                    for (Account item : account) {
                        found = item.search(accountNumber);
                        if (found) {
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Account does not exist");
                    }
                    break;
                case DEPOSIT:
                    System.out.print("Enter the account number ");
                    accountNumber = sc.next();
                    for (Account item : account) {
                        found = item.search(accountNumber);
                        if (found) {
                            item.deposit();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Account does not exist");
                    }
                    break;
                case WITHDRAWAL:
                    System.out.print("Enter the account number ");
                    accountNumber = sc.next();
                    for (Account item : account) {
                        found = item.search(accountNumber);
                        if (found) {
                            item.withdrawal();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Account does not exist");
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