package lab1;

import java.util.ArrayList;

/**
 * Created by Admin on 10/4/2017 at 10:32 AM
 **/
public class DocumentFactory implements IMessager {
    private Man man;
    private Organization org;
    private IListener listener;

    DocumentFactory(Man man, Organization org){
        this.man = man;
        this.org = org;
    }

    DocumentFactory(Man man, Organization org, IListener listener){
        this.man = man;
        this.org = org;
        this.listener = listener;
    }

    public IDocument getSpravka(){
        notify_message();
        return  new SpravkaDoc(man, org);
    }

    public IDocument getCommandDoc(){
        notify_message();
        return new CommandDoc(man, org);
    }

    public ArrayList<IDocument> getDocuments(){
        ArrayList<IDocument> arr = new ArrayList<IDocument>();
        arr.add(getSpravka());
        arr.add(getCommandDoc());
        return arr;
    }

    public void subscribe(IListener listener){

    }

    public void notify_message(){
        listener.listen();
    }


}
