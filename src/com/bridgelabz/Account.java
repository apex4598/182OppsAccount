package com.bridgelabz;

import java.util.Scanner;

public class Account {
    private String accNo;
    private String name;
    private long balance;

    Scanner sc = new Scanner(System.in);
    void openAccount() {
        System.out.print("Enter Account No: ");
        accNo = sc.next();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Balance: ");
        balance = sc.nextLong();
    }
    void showAccount() {
        System.out.println(accNo + " " + name + " " + balance);
    }


    }

