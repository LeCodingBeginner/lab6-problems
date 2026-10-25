package problem2;

import java.util.ArrayList;

public class Bank {
    private String name ;
    private ArrayList<Customer> customers;

    public Bank(String name){
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void add(Customer c){
        for (Customer cus : this.customers){
            if (cus.getName().equals(c.getName())){
                System.out.println("Customer of name: " + c.getName() + " is already a customer.");
                return;
            }
        }
        this.customers.add(c);
        System.out.println("Customer of name: " + c.getName() + " has been added.");
    }

    public void addTransaction(Customer c, Double transaction){
        for (Customer cus : this.customers){
            if (cus.getName().equals(c.getName())){
                c.getTransactions().add(transaction);
                return;
            }
        }

        System.out.println("Customer of name: " + c.getName() + " has not been found.");
    }

    public void printCustomerTransactions(Customer c){
        // let's first check that the customer exists:
        for (Customer cus : this.customers){
            if (cus.getName().equals(c.getName())){
                System.out.println("The customer of name : " + c.getName() + ". Has the following transactions: ");
                for (int i = 0 ; i < c.getTransactions().size() ; i ++){
                    System.out.println("Transaction ["+i+1+"] : " + c.getTransactions().get(i));
                }
                return;
            }
        }
        System.out.println("Customer of name: " + c.getName() + " has not been found.");
    }


}
