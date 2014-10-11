package cardemo;

public class ElectricCar extends Car {

    private float power;

    public ElectricCar(float power, float weight, int price) {
        super(weight, price);
        this.power = power;
    }

    @Override
    public float consumption(float distance) {
        return distance * (weight + power);
    }

}
