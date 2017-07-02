/**
 * Created by hrith on 02/07/2017.
 */
public class Clothes {
    private int shorts;
    private int shirts;
    private int trousers;
    private int hoodies;
    private int ageSize;

    public Clothes(int shorts, int shirts, int trousers, int hoodies, int ageSize) {
        this.shorts = shorts;
        this.shirts = shirts;
        this.trousers = trousers;
        this.hoodies = hoodies;
        this.ageSize = ageSize;
    }

    public int getShorts() {
        return shorts;
    }

    public int getShirts() {
        return shirts;
    }

    public int getTrousers() {
        return trousers;
    }

    public int getHoodies() {
        return hoodies;
    }

    public int getAgeSize() {
        return ageSize;
    }
}

