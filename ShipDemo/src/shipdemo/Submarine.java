package shipdemo;

public class Submarine extends Ship {

    private float depth;

    public Submarine(float x, float y, int pass_count, String irany, boolean halad, float depth) {
        super(x, y, pass_count, irany, halad);
        this.depth = depth;
    }
    
    public float depth_change(float new_depth)
    {
        depth = new_depth;
        return depth;
    }

    private String hereistheshipwhereistheship() {
        if (depth == 0) {
            return "Felszínen van";
        }
        if (depth < 0) {
            String depth_s = Float.toString(depth);
            return "Felszín alatt van: " + depth_s + "méterrel.";
        } else {
            return "Autista repülő hajó...";
        }
    }
    
    @Override
    public String toString(){
        return "Koordináták: (" + x + "," + y + ")" + "\nUtasok száma: " + pass_count + "\nIrány: " + irany + "\nHalad-e: " + haladtostring() + "\nHol a tengeralattjáró? " + hereistheshipwhereistheship();
    }
}
