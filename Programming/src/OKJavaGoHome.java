import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OKJavaGoHome {
    public static void main(String[] args) {
        String id = "JAVA APT 507";

        // Elevator call
        Elevator myElevator = new Elevator(id);
        myElevator.callForUp(1); // 1 층으로 엘레베이터 보내라

        // Security off
        Security mySecurity = new Security(id);
        mySecurity.off();

        // Light on
        Lighting hallLamp = new Lighting(id + " / Hall Lamp");
        hallLamp.on(); // 거실 등 on

        Lighting floorLamp = new Lighting(id + " / Floor Lamp");
        floorLamp.on();
    }
}
