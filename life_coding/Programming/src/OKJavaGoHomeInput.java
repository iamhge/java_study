import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

import javax.swing.JOptionPane;

public class OKJavaGoHomeInput {
    // args : parameter, 매개변수
    public static void main(String[] args) {
        // 입력값 받는 방법 1) Dialog
        // String id = JOptionPane.showInputDialog("Enter a ID");
        // double bright = Double.parseDouble(JOptionPane.showInputDialog("Enter a Bright level"));

        // 입력값 받는 방법 2) args parameter
        String id = args[0];
        double bright = Double.parseDouble(args[1]);

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
