/**
 * Created by hrith on 02/07/2017.
 */
public class Lights {
    private String style;
    private boolean battery;

    public Lights(String style, boolean battery) {
        this.style = style;
        this.battery = battery;
    }
    public void turnOn(){
        System.out.println("Turning lights on");
    }
    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }
}
