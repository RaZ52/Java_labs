package lab1;

import java.util.ArrayList;

/**
 * Created by Admin on 9/20/2017 at 10:20 AM
 **/
public class App {
    public static void main(String[] args){
        Man man = Man.getM("Zuevskiy", "Ivan");
        Organization org = Organization.getOrg("Vasyan's Inc");
        Logger logger = new Logger();
        ArrayList<Transport> orgCars = new ArrayList<Transport>();
        orgCars.add(new Transport("Model", "123", "red", org.getOrganizationName()));
        orgCars.add(new Transport("Model2", "543", "green", org.getOrganizationName()));
        orgCars.add(new Transport("Model3", "653", "yellow", org.getOrganizationName()));
        orgCars.add(new Transport("Model4", "841", "black", org.getOrganizationName()));
        orgCars.add(orgCars.get(1).copy());
        orgCars.add(orgCars.get(1).copy());
        orgCars.add(orgCars.get(1).copy());
        org.setOrganizationCars(orgCars);
        System.out.println(org.getOrganizationCars());
/*        lab1.IDocument document = new lab1.CommandDoc(man, org);
        document.getDocument();
        document = new lab1.SpravkaDoc(man, org);
        document.getDocument();*/
        DocumentFactory documentFactory = new DocumentFactory(man, org, logger);
        ArrayList<IDocument> documentArrayList = new ArrayList<IDocument>();
        documentArrayList = documentFactory.getDocuments();
        Printer printer = new Printer(documentArrayList);
        printer.print();
    }
}
