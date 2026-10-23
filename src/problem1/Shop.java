package problem1;

import java.util.ArrayList;
import java.util.Scanner;
public class Shop
{
    public static void main (String[] args)
    {
        ArrayList<Item> cart = new ArrayList<>();
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";
        double totalPrice = 0;
        do
        {
            System.out.print ("Enter the name of the item: ");
            itemName = scan.nextLine();
            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();
// *** create a new item and add it to the cart
            item = new Item(itemName,itemPrice,quantity);
            cart.add(item);
            // *** print the contents of the cart object using println
            System.out.println("The content of your shopping cart for now is: ");
            /*
            System.out.println(cart.toString());
            */

            for (Item i : cart){
                totalPrice+= i.getPrice() * i.getQuantity();
                System.out.println(i.getName() + "("+i.getQuantity()+") - Price: " + i.getQuantity()*i.getPrice() + " MAD");
            }

            System.out.print ("Continue shopping (y/n)? ");
            scan.nextLine();
            keepShopping = scan.nextLine();
        }
        while (keepShopping.equals("y"));

        System.out.println("The total price is : " + totalPrice + " MAD");
    }

}
