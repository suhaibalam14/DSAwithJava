package Classroom.Inheritence;

public class Car extends  Vehicle{
    String carType;
    boolean autoDrive;

    public Car() {
    }

    public Car(int engineCC, int noOfDoors, int noOfSeats, String engineType) {
        super(engineCC, noOfDoors, noOfSeats, engineType);
    }

    public Car(String carType, boolean autoDrive) {
        this.carType = carType;
        this.autoDrive = autoDrive;
    }

    public Car(int engineCC, int noOfDoors, int noOfSeats, String engineType, String carType, boolean autoDrive) {
        super(engineCC, noOfDoors, noOfSeats, engineType);
        this.carType = carType;
        this.autoDrive = autoDrive;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public boolean isAutoDrive() {
        return autoDrive;
    }

    public void setAutoDrive(boolean autoDrive) {
        this.autoDrive = autoDrive;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType='" + carType + '\'' +
                ", autoDrive=" + autoDrive +
                '}';
    }
    void print(){
        System.out.println("Car class ");
    }
}
