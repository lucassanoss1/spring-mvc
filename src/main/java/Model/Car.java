package Model;

public class Car {

    private String model;

    private Integer number;

    public String country;

    public Car(String model, int number, String country) {
        this.model = model;
        this.number = number;
        this.country = country;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", number=" + number +
                ", country='" + country + '\'' +
                '}';
    }
}
