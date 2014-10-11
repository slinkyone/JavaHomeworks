package cardemo;

public class DieselCar extends InternalCombustionCar {

    public DieselCar(int cylinderNumber, float volume, float weight, int price) {
        super(cylinderNumber, volume, weight, price);
    }

    @Override
    public float consumption(float distance) {
        return distance * (weight + volume);
    }

}
