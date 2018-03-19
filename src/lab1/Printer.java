package lab1;

import java.util.ArrayList;

/**
 * Created by Admin on 10/4/2017 at 10:27 AM
 **/
public class Printer {
    ArrayList<IDocument> documents = new ArrayList<IDocument>();
    Printer(ArrayList<IDocument> arrlistdoc){
        documents = arrlistdoc;
    }

    public void print(){
        for (int i = 0; i < documents.size(); i++) {
            documents.get(i).getDocument();
        }
    }
}
