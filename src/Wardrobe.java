/**
 * Created by hrith on 02/07/2017.
 */
public class Wardrobe {
    private int shelves;
    private Dimensions dimension;
    private Clothes clothes;

    public Wardrobe(int shelves, Dimensions dimension, Clothes clothes) {
        this.shelves = shelves;
        this.dimension = dimension;
        this.clothes = clothes;
    }

    public int getShelves() {
        return shelves;
    }

    public Dimensions getDimension() {
        return dimension;
    }

    public Clothes getClothes() {
        return clothes;
    }
}
