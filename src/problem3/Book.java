package problem3;

public class Book extends Document{
    private String author;
    private int nbrPages;

    public Book(String title, String author,int nbrPages){
        super(title);
        this.author = author;
        this.nbrPages = nbrPages;
    }


    public int getNumRec() {
        return super.getNumRec();
    }

    public String getTitle() {
        return super.getTitle();
    }

    public String getAuthor() {
        return author;
    }

    public int getNbrPages() {
        return nbrPages;
    }

    public String toString(){
        StringBuilder s = new StringBuilder(super.toString());
        s.append("\n").append("Author: ").append(author).append("\n").append(nbrPages).append(" Pages.");
        return  s.toString();
    }
}
