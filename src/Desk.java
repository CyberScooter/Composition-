/**
 * Created by hrith on 02/07/2017.
 */
public class Desk {
    private int stationairy_tools;
    private int number_of_books;
    private int paper;
    private Dimensions dimensions;
    private PC computer;

    public Desk(int stationairy_tools, int number_of_books, int paper, Dimensions dimensions, PC computer) {
        this.stationairy_tools = stationairy_tools;
        this.number_of_books = number_of_books;
        this.paper = paper;
        this.dimensions = dimensions;
        this.computer = computer;
    }

    public void cleanDesk(){
        System.out.println("Cleaning desk...");
    }

    public int getStationairy_tools() {
        return stationairy_tools;
    }

    public int getNumber_of_books() {
        return number_of_books;
    }

    public int getPaper() {
        return paper;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public PC getComputer() {
        return computer;
    }
}
