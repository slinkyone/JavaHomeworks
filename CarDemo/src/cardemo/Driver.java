package cardemo;

public class Driver {
    
    String Drivertype;

    public Driver(String Drivertype) {
        this.Drivertype = Drivertype;
    }
    
    public int DriverType() {
        if (Drivertype.equals("SafeDriver"))
        {
            return 1000;
        }
        if (Drivertype.equals("CrazyDriver")){
            return 2000;
        }
        else return 0;
    }
    
}
