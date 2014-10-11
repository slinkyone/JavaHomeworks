package cardemo;

public abstract class Car {

    protected float weight;
    protected int price;

    public Car(float weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    public abstract float consumption(float distance);
}
