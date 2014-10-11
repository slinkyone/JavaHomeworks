package cardemo;

public class PetrolCar extends InternalCombustionCar {

    public PetrolCar(int cylinderNumber, float volume, float weight, int price) {
        super(cylinderNumber, volume, weight, price);
    }

    @Override
    public float consumption(float distance) {
        return distance * weight * cylinderNumber * volume;
    }
}
