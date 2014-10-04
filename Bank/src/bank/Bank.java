package bank;

public class Bank {

    public static void main(String[] args) {
        Muveletek b1 = new Muveletek("Lajos", 10000, 1000, 5000);
        
        System.out.println("Kivetel utan: " + b1.Kivon());
        System.out.println("Betetel utan: " + b1.Összead());
        System.out.println("Egyenleg: " + b1.toString());
    }
}
