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
                    System.out.println("Your balance is $" + Main.account.get(name));
                    break;

                case "withdraw funds":
                    System.out.println("How much would you like to withdraw?");
                    double funds = Double.valueOf(Main.scanner.nextLine());
                    accountBalance = accountBalance - funds;
                        if (funds < accountBalance) {
                             System.out.println("Please take your cash!");
                             System.out.println("Your remaining balance is: $" + accountBalance);}
                        else {
                             System.out.println("Insufficient funds");}
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

