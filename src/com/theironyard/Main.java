package com.theironyard.charlotte;

import java.util.HashMap;
import java.util.Scanner;


public class Main extends User {

    public static Scanner scanner = new Scanner(System.in);
    public static HashMap<String, Double> account = new HashMap<>();


    public static void main(String[] args) {

        User user = new User();


        account.put("Peter_Ckg", 4378.8);
        account.put("Peter_Svg", 5000.0);
        account.put("Cleveland_Ckg", 3478.0);
        account.put("Cleveland_Svg", 5000.0);
        account.put("Quagmire_Ckg", 1265.0);
        account.put("Quagmire_Svg", 5000.0);


        user.checkName();
        System.out.println("Hi " + name + ". How can we help you today?");
        System.out.println("1. Check Account Balance";)
        System.out.println("2. Check Ckg Balance");
        System.out.println("3. Check Svgs Balance");
        System.out.println("4. Withdraw Funds");
        System.out.println("5. Remove Account");
        System.out.println("6. Cancel");

        user.transaction();



    }
}












