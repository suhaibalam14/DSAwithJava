package Classroom.Inheritence;

public class Vehicle {
    int engineCC;
    int noOfDoors;
    int noOfSeats;
    String engineType;

    public Vehicle() {
    }

    public Vehicle(int engineCC, int noOfDoors, int noOfSeats, String engineType) {
        this.engineCC = engineCC;
        this.noOfDoors = noOfDoors;
        this.noOfSeats = noOfSeats;
        this.engineType = engineType;
    }

    public int getEngineCC() {
        return engineCC;
    }

    public void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "engineCC=" + engineCC +
                ", noOfDoors=" + noOfDoors +
                ", noOfSeats=" + noOfSeats +
                ", engineType='" + engineType + '\'' +
                '}';
    }
    void print(){
        System.out.println("Vehicle class");
    }
}
