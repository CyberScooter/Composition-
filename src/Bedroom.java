/**
 * Created by hrith on 02/07/2017.
 */
public class Bedroom {

    // basically inputting an object into another object
    private Bed myBed;
    private Desk myDesk;
    private Wardrobe myWardrobe;
    private Lights myLights;
    //references to the objects ^^

    public Bedroom(Bed myBed, Desk myDesk, Wardrobe myWardrobe, Lights myLights) {
        this.myBed = myBed;
        this.myDesk = myDesk;
        this.myWardrobe = myWardrobe;
        this.myLights = myLights;
    }
    public void closeDoor(){
        System.out.println("Closing door...");
    }
    public Bed getMyBed() {
        return myBed;
    }
    public void turnOnPC(){
        myDesk.getComputer().turnOn();
    }

    public Desk getMyDesk() {
        return myDesk;
    }
    public void cleanBed(){
        myBed.cleanBed();
    }

    public Wardrobe getMyWardrobe() {
        return myWardrobe;
    }
    public Lights getMyLights(){return myLights;}
}
