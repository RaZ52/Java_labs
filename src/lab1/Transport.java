package lab1;

/**
 * Created by Admin on 9/20/2017 at 11:31 AM
 * Класс, Индивиж, Аттрибут
 * Объектное свойство
 * Свойство данных
 * Свойство Значения
 **/
public class Transport {
    private String carModel;
    private String carNumber;
    private String carColour;
    private String carHolder;

    public String getCarModel() {
        return carModel;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public String getCarColour() {
        return carColour;
    }

    public String getCarHolder() {
        return carHolder;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public void setCarColour(String carColour) {
        this.carColour = carColour;
    }

    public void setCarHolder(String carHolder) {
        this.carHolder = carHolder;
    }

    public Transport(String carModel, String carNumber, String carColour, String carHolder) {
        this.carModel = carModel;
        this.carNumber = carNumber;
        this.carColour = carColour;
        this.carHolder = carHolder;
    }

    @Override
    public String toString() {
        return "lab1.Transport{" +
                "carModel='" + carModel + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ", carColour='" + carColour + '\'' +
                ", carHolder='" + carHolder + '\'' +
                '}';
    }

    public Transport copy(){
        return new Transport(this.carModel, this.carNumber, this.carColour, this.carHolder);
    }
}
