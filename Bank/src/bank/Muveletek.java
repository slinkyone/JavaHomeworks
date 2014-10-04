package bank;

public class Muveletek {

    private String owner;
    private int money;
    private int minus;
    private int plus;

    private int actual = 0;

    Muveletek(String owner, int money, int minus, int plus) {
        this.owner = owner;
        this.money = money;
        this.minus = minus;
        this.plus = plus;
    }

    public int Kivon() {
        actual = money - minus;
        return actual;
    }

    public int Összead() {
        actual = money + plus;
        return actual;
    }
    
    @Override
    public String toString(){
        return "Owner: " + owner + ", Money: " + actual;
    }
}
