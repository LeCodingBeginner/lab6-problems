package problem3;

public class Novel extends Book{
    private double price;

    public Novel(String title, String author, int nprPages,double price){
        super(title,author,nprPages);
        this.price = price;
    }

    public int getNumRec() {
        return super.getNumRec();
    }

    public int getNbrPages() {
        return super.getNbrPages();
    }

    public String getAuthor() {
        return super.getAuthor();
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return super.getTitle();
    }

    public String toString() {
        return super.toString() + " \n" + "Price : " + this.price;
    }
}
