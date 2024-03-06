package web.models;

public class Car {

    private String carBrand;
    private String carModel;
    private int carYear;

    public Car(String carBrand, String carModel, int carYear) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carYear = carYear;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carYear=" + carYear +
                '}';
    }
}
