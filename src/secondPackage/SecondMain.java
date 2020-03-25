package secondPackage;

import hu.flowacademy.Car;

public class SecondMain {

    public Car c;

    public SecondMain() {
        c = new Car("asd", 3, "Trabi", "asd");
        // c.licensePlate protected esetén nem látható
    }
}
