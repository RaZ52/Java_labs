package lab1;

/**
 * Created by Admin on 10/4/2017 at 9:46 AM
 **/
public class CommandDoc implements IDocument {
    Man man;
    Organization org;

    public CommandDoc(Man man, Organization org){
        this.man = man;
        this.org = org;
    }

    public void getDocument(){
        System.out.println("Коммандировочный лист для " + man.getSur() + " " + man.getName() + " из компании " + org.getOrganizationName());
    }
}
