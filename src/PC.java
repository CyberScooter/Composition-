/**
 * Created by hrith on 02/07/2017.
 */
public class PC {
    private int monitors;
    private String os;

    public PC(int monitors, String os) {
        this.monitors = monitors;
        this.os = os;
    }

    public void turnOff(){
        System.out.println("PC is shutting down...");
    }
    public void turnOn(){
        System.out.println("PC is turning on...");
    }

    public int getMonitors() {
        return monitors;
    }

    public String getOs() {
        return os;
    }
}
