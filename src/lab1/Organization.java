package lab1;

import java.util.ArrayList;

/**
 * Created by Admin on 9/20/2017 at 11:31 AM
 **/
public class Organization {
    private static Organization org;
    private String organizationName;
    private ArrayList<Transport> organizationCars = new ArrayList<Transport>();

    public ArrayList<Transport> getOrganizationCars() {
        return organizationCars;
    }

    public void setOrganizationCars(ArrayList<Transport> organizationCars) {
        this.organizationCars = organizationCars;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Organization that = (Organization) o;

        return organizationName != null ? organizationName.equals(that.organizationName) : that.organizationName == null;
    }

    @Override
    public int hashCode() {
        return organizationName != null ? organizationName.hashCode() : 0;
    }

    private Organization(String organizationName) {
        this.organizationName = organizationName;
    }

    public static Organization getOrg(String organizationName){
        if(org == null){
            org = new Organization(organizationName);
        }
        return org;
    }

    @Override
    public String toString() {
        return "lab1.Organization{" +
                "organizationName='" + organizationName + '\'' +
                ", organizationCars=" + organizationCars +
                '}';
    }
}
