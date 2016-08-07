package com.theironyard.charlotte;

import java.util.HashMap;
import java.util.Scanner;


public class Main extends User {

    public static Scanner scanner = new Scanner(System.in);
    public static HashMap<String, Double> account = new HashMap<>();


    public static void main(String[] args) {

        User user = new User();


        account.put("Peter", 4378.8);
        account.put("Cleveland", 3478.0);
        account.put("Quagmire", 1265.0);


        user.checkName();
        System.out.println("Hi " + name + ". How can we help you today?");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Funds");
        System.out.println("3. Remove Account");
        System.out.println("4. Cancel");

        user.transaction();



    }
}












