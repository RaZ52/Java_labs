package lab1;

/**
 * Created by Admin on 10/4/2017 at 9:46 AM
 **/
public class SpravkaDoc implements IDocument {
    Man man;
    Organization org;

    public SpravkaDoc(Man man, Organization org){
        this.man = man;
        this.org = org;
    }

    public void getDocument(){
        System.out.println("Справка для " + man.getSur() + " " + man.getName() + " из компании " + org.getOrganizationName());
    }
}
