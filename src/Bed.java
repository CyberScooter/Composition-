/**
 * Created by hrith on 02/07/2017.
 */
public class Bed {
    private int pillows;
    private String size;
    private String colour;

    public Bed(int pillows, String size, String colour) {
        this.pillows = pillows;
        this.size = size;
        this.colour = colour;
    }

    public int getPillows() {
        return pillows;
    }

    public String getSize() {
        return size;
    }

    public void cleanBed(){
        System.out.println("Cleaning bed in progress...");
    }

    public String getColour() {
        return colour;
    }
}
