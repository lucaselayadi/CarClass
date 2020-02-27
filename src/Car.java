public class Car {
    private int year;
    private String make;
    private int Miles;
    private String model;

    public Car(int year, String make, int miles, String model) {
        this.year = year;
        this.make = make;
        Miles = miles;
        this.model = model;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setMiles(int miles) {
        Miles = miles;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public int getMiles() {
        return Miles;
    }

    public String getModel() {
        return model;
    }

    public void drive(int miles){
        this.Miles += miles;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", make='" + make + '\'' +
                ", Miles=" + Miles +
                ", model='" + model + '\'' +
                '}';
    }
}
