package cardemo;

public abstract class InternalCombustionCar extends Car {

    protected int cylinderNumber;
    protected float volume;

    public InternalCombustionCar(int cylinderNumber, float volume, float weight, int price) {
        super(weight, price);
        this.cylinderNumber = cylinderNumber;
        this.volume = volume;
    }
}
