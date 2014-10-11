package cardemo;

import java.util.LinkedList;
import java.util.List;

public class CarDemo {

    public static void main(String[] args) {
        List<Car> cars = new LinkedList<>();
        cars.add(new PetrolCar(4, 300, 300, 500000));
        cars.add(new ElectricCar(2, 500, 4000000));
        /*for (Car car : cars) {
            System.out.println(car.consumption(100));
        }*/
        
        List<Driver> drivers = new LinkedList<>();
        drivers.add(new Driver ("CrazyDriver"));
        drivers.add(new Driver ("SafeDriver"));
        
        for (int i = 0; i < drivers.size(); i++) {
            System.out.println(drivers.get(i).DriverType() * cars.get(i).consumption(100));
            
        }
    }
}
