import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

import javax.swing.JOptionPane;

public class OKJavaGoHomeInput {
    public static void main(String[] args) {
        String id = JOptionPane.showInputDialog("Enter a ID");
        double bright = Double.parseDouble(JOptionPane.showInputDialog("Enter a Bright level"));

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

        // 밝기 조절
        DimmingLights moodLamp = new DimmingLights(id + " / moodLamp");
        moodLamp.setBright(bright);
    }
}
