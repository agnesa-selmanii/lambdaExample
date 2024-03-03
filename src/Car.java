public class Car {
    private String make;
    private int topSpeed, year;


    public Car(String make, int topSpeed, int year) {
        setMake(make);
        setTopSpeed(topSpeed);
        setYear(year);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", topSpeed=" + topSpeed +
                ", year=" + year +
                '}';
    }
}
