package problem3;

import java.util.Scanner;

public class Test {
    public static void main(String[] argv){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the max capacity of your library: ");
        int n = scan.nextInt();

        Library l = new Library(n);

        Book b1 = new Book("Younes Le prince violent","Omar Tsouli",499);
        Book b2 = new Book("Younes Le prince turbulent","Omar Tsouli",199);

        l.add(b1);
        l.add(b2);

        System.out.println("1. Add a document\n2. Display \n3.Delete an element");
        System.out.println("Please select a number (add/display/delete) from the menu: ");
        int choice1 = scan.nextInt();
        scan.nextLine();

        switch (choice1){
            case 1:
                System.out.println("Please input the title: ");
                String title = scan.nextLine();
                System.out.println("Which type of document ? \n1.Book \n2.Magazine \n3.Dictionary");
                System.out.println("Please select one choice: ");
                int choice2 = scan.nextInt();
                scan.nextLine();
                switch (choice2){
                    case 1:
                        String author;
                        int nbrPages;
                        System.out.println("Please input the author of the book: ");
                        author = scan.nextLine();
                        System.out.println("Please enter the # of pages of the book: ");
                        nbrPages = scan.nextInt();
                        System.out.println("Which type of book ? \n1.Novel \n2.Textbook");
                        System.out.println("Please select one choice: ");
                        int choice3 = scan.nextInt();
                        scan.nextLine();
                        switch (choice3){
                            case 1:
                                System.out.println("Please enter the price of the novel: ");
                                double price = scan.nextDouble();
                                scan.nextLine();
                                l.add(new Novel(title,author,nbrPages,price));
                                break;
                            case 2:
                                System.out.println("Please enter the level of the Textbook: ");
                                String level = scan.nextLine();
                                l.add(new Textbook(title,author,nbrPages,level));
                                break;
                            default:
                                throw new IllegalArgumentException("Wrong input");

                        }
                        break;
                    case 2:
                        System.out.println("Please input the month of the magazine: ");
                        String month = scan.nextLine();
                        System.out.println("Please enter the year of the magazine: ");
                        int year = scan.nextInt();
                        scan.nextLine();
                        l.add(new Magazine(title, month, year));
                        break;

                    case 3:
                        System.out.println("Please input the language of the dictionary: ");
                        String language = scan.nextLine();
                        l.add(new Dictionary(title, language));
                        break;

                    default:
                        throw new IllegalArgumentException("Wrong document type input");
                }
                break;
            case 2:
                l.displayDocuments();
                break;

            case 3:
                System.out.println("Input the id of the document that you want to delete: ");
                int id = scan.nextInt();
                l.delete(l.document(id));
                break;

            default:
                throw new IllegalArgumentException("Invalid menu selection");

        }

        
    }
}
