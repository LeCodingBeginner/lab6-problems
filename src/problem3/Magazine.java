package problem3;

public class Magazine extends Document{
    private String month;
    private int year;

    public Magazine(String title, String month,int year){
        super(title);
        this.month = month;
        this.year = year;
    }


    public int getNumRec() {
        return super.getNumRec();
    }

    public String getTitle() {
        return super.getTitle();
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String toString(){
        StringBuilder s = new StringBuilder(super.toString());
        s.append("\n").append("Month: ").append(month).append("\n").append("Year").append(year);
        return  s.toString();
    }
}
