package OOPs.ObjectCloning;

public class Car implements Cloneable{
    int model;
    int seats;
    int[] arr;

    public Car(int model, int seats) {
        this.model = model;
        this.seats = seats;
        this.arr = new int[]{3,4,5,7,5,3,2};
    }

//    public Car(Car anyCar) {
//        this.model= anyCar.model;
//        this.seats= anyCar.seats;
//        this.arr= anyCar.arr;
//    }


    //this is shallow copy
//    public Object clone() throws CloneNotSupportedException{
//        return super.clone();
//    }


    //this is deep copy
    public Object clone() throws CloneNotSupportedException{
        Car newCar = (Car) super.clone(); // this is also shallow copy

        newCar.arr = new int[newCar.arr.length];
        for (int i = 0; i < newCar.arr.length; i++) {
            newCar.arr[i] = this.arr[i];
        }
        return newCar;
    }

}
