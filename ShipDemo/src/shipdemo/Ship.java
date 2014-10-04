package shipdemo;

public class Ship {
    
    protected float x;
    protected float y;
    protected int pass_count;
    protected String irany;
    protected boolean halad;
    
    public Ship(float x, float y, int pass_count, String irany, boolean halad) {
        this.x = x;
        this.y = y;
        this.pass_count = pass_count;
        this.irany = irany;
        this.halad = halad;
    }
    
    public String irany_valt(String new_irany){
        irany = new_irany;
        return irany;
    }
    
    public boolean halad_e(boolean halad_valt){
        halad = halad_valt;
        return halad;
    }
    
    public String haladtostring() {
        if (halad == true) {
            return "halad";
        } else {
            return "nem halad";
        }
    }
    
    @Override
    public String toString(){
        return "Koordináták: (" + x + "," + y + ")" + "\nUtasok száma: " + pass_count + "\nIrány: " + irany + "\nHalad-e: " + haladtostring();
    }
}
