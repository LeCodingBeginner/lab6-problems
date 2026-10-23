package problem3;

public class Textbook extends Book{
    private String level;

    public Textbook(String title, String author, int nprPages,String level){
        super(title,author,nprPages);
        this.level = level;
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

    public String getLevel() {
        return level;
    }

    public String getTitle() {
        return super.getTitle();
    }

    public String toString() {
        return super.toString() + " \n" + "Level : " + this.level;
    }
}
