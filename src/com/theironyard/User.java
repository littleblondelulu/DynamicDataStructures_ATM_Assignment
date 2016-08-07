package com.theironyard.charlotte;

/**
 * Created by lindseyringwald on 8/7/16.
 */
class User{

    public static String name;
    public static double accountBalance;

    public static void checkName() {
        System.out.println("Please enter your name.");
        name = Main.scanner.nextLine();

        if (!(Main.account.containsKey(name))) {
            System.out.println(name + ", would you like to open an account? [y/n]");
            String answer = Main.scanner.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                Main.account.put(name, 100.00);
                System.out.println("Great! We've created an account for you.");
                accountBalance = Double.valueOf(Main.account.get(name));

            }
           else {
               System.out.println("Really?");
            }
        }
    }

/*TEST -- works!
if(Main.account.containsKey(name)) {
    double accountBalance = Double.valueOf(Main.account.get(name));
    System.out.println("Account balance for " + name + " is: " + accountBalance);
} */


    public static String transaction() {
        String selection = Main.scanner.nextLine();

        while (!(selection.equalsIgnoreCase("cancel"))) {
            switch (selection) {
                case "check balance":
                    accountBalance = Main.account.get(name);
                    System.out.println("Your balance is $" + accountBalance);
                    break;

                case "withdraw funds":
                    System.out.println("How much would you like to withdraw?");
                    double funds = Double.valueOf(Main.scanner.nextLine());
                    accountBalance -= funds;
                        if (funds < accountBalance) {
                             System.out.println("Please take your cash!");
                             System.out.println("Your remaining balance is: $" + accountBalance);}
                        else {
                             System.out.println("Insufficient funds");}
                    break;

                case "transfer funds":
                    System.out.println("Amount you would like to transfer:");
                    double amount = Double.valueOf(Main.scanner.nextLine());
                    accountBalance -= amount;

                    System.out.println("Who would you like too transfer it to?");
                    String reciever = Main.scanner.nextLine();

                    Main.account.put(name, accountBalance);
                    System.out.println(name + " $" + amount + "has been transfered. Your remaining balance is  " + accountBalance);

                    double accountBalance2 = Double.valueOf(Main.account.get(reciever));
                    accountBalance2 += amount;
                    Main.account.put(reciever, accountBalance2);
                    System.out.println(reciever + ": An amount of $" + amount + " has been added to your account");
                    System.out.println("Your new balance is " + accountBalance2);

                    break;
                    
                case "remove account":
                    Main.account.remove(name);
                    System.out.println("Your account has been removed.");
                    break;

                case "cancel":
                    System.out.println("Cancelled");
                    break;

                default:
                    System.out.println("Please select an op from menu...");
                    break;
            }

            System.out.println("Select another transaction");
            selection = Main.scanner.nextLine();
        }

        return selection;
    }
}

