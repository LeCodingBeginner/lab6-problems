package problem3;

import javax.print.Doc;

public class Dictionary extends Document {
    private String language;

    public Dictionary(String title, String language){
        super(title);
        this.language = language;
    }


    public int getNumRec() {
        return super.getNumRec();
    }

    public String getTitle() {
        return super.getTitle();
    }

    public String getLanguage() {
        return language;
    }

    public String toString(){
        StringBuilder s = new StringBuilder(super.toString());
        s.append("\n").append("Language: ").append(language);
        return  s.toString();
    }
}
