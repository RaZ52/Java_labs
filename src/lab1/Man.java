package lab1;

/**
 * Created by Admin on 9/20/2017 at 10:25 AM
 **/
public class Man {
    private String sur;
    private String name;

    private static Man m;

    public String getSur() {
        return sur;
    }

    public String getName() {
        return name;
    }

    public void setSur(String sur) {
        this.sur = sur;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Man(String sur, String name){
        this.sur = sur;
        this.name = name;
    }

    public static Man getM(String sur, String name){
        if(m == null){
            m = new Man(sur, name);
        }
        else{
            System.out.println("WARNING: class already created!");
        }
        return m;
    }

    @Override
    public String toString() {
        return "lab1.Man{" +
                "sur='" + sur + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
