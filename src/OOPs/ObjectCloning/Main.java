package OOPs.ObjectCloning;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) throws CloneNotSupportedException {
//        Car maruti = new Car(2013, 4);
//        Car beleno = new Car(maruti);
//
//        System.out.println(maruti.model);
//        System.out.println(maruti.seats);
//        System.out.println(Arrays.toString(maruti.arr));
//        System.out.println(beleno.model);
//        System.out.println(beleno.seats);
//        System.out.println(Arrays.toString(beleno.arr));
//
//        maruti.arr[0] = 25;
//        System.out.println(Arrays.toString(maruti.arr));
//        System.out.println(Arrays.toString(beleno.arr));

//        Car myCar = new Car(2024, 4);
//        Car newCar = (Car) myCar.clone();
//        System.out.println(myCar.model);
//        System.out.println(myCar.seats);
//        System.out.println(Arrays.toString(myCar.arr));
//        System.out.println(newCar.model);
//        System.out.println(newCar.seats);
//        System.out.println(Arrays.toString(newCar.arr));
//
//        myCar.arr[2] = 100;
//        System.out.println(Arrays.toString(newCar.arr));
//        System.out.println(Arrays.toString(myCar.arr));

        Car hahaCar = new Car(2017, 4);
        Car waahCar = (Car) hahaCar.clone();

        System.out.println(hahaCar.model);
        System.out.println(hahaCar.seats);
        System.out.println(Arrays.toString(hahaCar.arr));
        hahaCar.arr[0] = 121;
        System.out.println(Arrays.toString(hahaCar.arr));

        System.out.println(waahCar.model);
        System.out.println(waahCar.seats);
        System.out.println(Arrays.toString(waahCar.arr));
        waahCar.model = 10002;
        System.out.println(hahaCar.model);
        System.out.println(waahCar.model);
    }
}
