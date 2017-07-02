/**
 * Created by hrith on 02/07/2017.
 */
public class main1 {
    public static void main(String[] args){
        Bed myBed = new Bed(2,"double", "blue");
        Desk myDesk = new Desk(20 , 4, 300, new Dimensions(120,200,100), new PC(1, "Windows 10"));
        Wardrobe myWardrobe = new Wardrobe(2, new Dimensions(200,50,100), new Clothes(5,5,10,20,17));

        Bedroom Hrithik = new Bedroom(myBed, myDesk, myWardrobe, new Lights("ceiling", true));

        Hrithik.getMyBed().getColour();
        Hrithik.getMyDesk().getComputer().turnOn();
        Hrithik.turnOnPC();
        Hrithik.cleanBed();
        Hrithik.getMyLights().turnOn();

    }
}
