package problem2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bank myBank = new Bank("Global Trust Bank");

        ArrayList<Double> t1 = new ArrayList<>();
        t1.add(1000.0);
        t1.add(-10.0);

        Customer c1 = new Customer("Younes",t1);

        myBank.add(c1);

        // Test 1: Adding new customers
        System.out.println("--- Adding Customers ---");
        System.out.println("Added " + c1.getName());


        // Test 2: Adding transactions (credits and debits) to existing customers
        System.out.println("\n--- Adding Transactions ---");
        myBank.addTransaction(c1, 250.0);
        System.out.println("Added credit to " + c1.getName());


    }
}