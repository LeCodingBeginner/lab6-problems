package problem3;

public class Document {
    private static int counter = 0;
    private int numRec;
    private String title;

    public Document(String title){
        counter++;
        this.numRec = counter;
        this.title = title;
    }

    public int getNumRec() {
        return numRec;
    }

    public String getTitle() {
        return title;
    }

    public String toString(){
        return "Record #" + numRec + " - " + title;
    }
}