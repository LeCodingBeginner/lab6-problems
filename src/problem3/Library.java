package problem3;

import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Document> documents;

    public Library(int capacity){
        this.capacity = capacity;
        this.documents = new ArrayList<>();
    }

    public int getCapacity(){
        return capacity;
    }

    public void displayDocuments(){
        System.out.println("The documents available in the library: ");
        for (int i = 0 ; i<documents.size(); i++){
            System.out.println(documents.get(i).toString());
        }
    }

    public boolean add(Document doc){
        if (documents.size() == capacity){
            return false;
        }
        documents.add(doc);
        return true;
    }

    public boolean delete(Document doc){
        if (documents.isEmpty()){
            return false;
        }
        for (int i = 0 ; i<documents.size(); i++){
            if (documents.get(i).getNumRec() == doc.getNumRec()){
                documents.remove(i);
                return true;
            }
        }
        return false;
    }

    Document document(int numRec){
        for (int i = 0 ; i<documents.size(); i++){
            if (documents.get(i).getNumRec() == numRec){
                return documents.get(i);
            }
        }
        return null;
    }

    void displayAuthors(){
        System.out.println("The authors of books available in the library are: ");
        for (int i = 0 ; i<documents.size(); i++){
            if (documents.get(i) instanceof Book){
                System.out.println(((Book) documents.get(i)).getAuthor());
            }
        }
    }

}
