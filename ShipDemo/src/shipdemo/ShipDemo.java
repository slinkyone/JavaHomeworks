package shipdemo;

public class ShipDemo {

    public static void main(String[] args) {
        Ship ship1 = new Ship(10, 20, 93, "előre", true);
        System.out.println(ship1.toString() + "\n");
        ship1.irany_valt("hátra");
        System.out.println(ship1.toString() + "\n");
        ship1.halad_e(false);
        System.out.println(ship1.toString() + "\n");

        Submarine sub1 = new Submarine(130, -440, 150, "jobbra", false, 0);
        System.out.println(sub1.toString() + "\n");
        sub1.irany_valt("balra");
        System.out.println(sub1.toString() + "\n");
        sub1.halad_e(true);
        System.out.println(sub1.toString() + "\n");
        sub1.depth_change(100);
        System.out.println(sub1.toString() + "\n");
    }

}
