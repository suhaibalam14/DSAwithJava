package Classroom.Inheritence;

public class Bike extends Vehicle {
    String bikeType;
    boolean cruiseControl;

    public Bike() {
    }

    public Bike(int engineCC, int noOfDoors, int noOfSeats, String engineType) {
        super(engineCC, noOfDoors, noOfSeats, engineType);
    }

    public Bike(String bikeType, Boolean cruiseControl) {
        this.bikeType = bikeType;
        this.cruiseControl = cruiseControl;
    }

    public Bike(int engineCC, int noOfDoors, int noOfSeats, String engineType, String bikeType, Boolean cruiseControl) {
        super(engineCC, noOfDoors, noOfSeats, engineType);
        this.bikeType = bikeType;
        this.cruiseControl = cruiseControl;
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public Boolean getCruiseControl() {
        return cruiseControl;
    }

    public void setCruiseControl(Boolean cruiseControl) {
        this.cruiseControl = cruiseControl;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "bikeType='" + bikeType + '\'' +
                ", cruiseControl=" + cruiseControl +
                ", engineCC=" + engineCC +
                ", noOfDoors=" + noOfDoors +
                ", noOfSeats=" + noOfSeats +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
