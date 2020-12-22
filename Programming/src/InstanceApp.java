import java.io.IOException;
import java.io.PrintWriter;

public class InstanceApp {
    public static void main(String[] args) throws IOException {
        // instance : 클래스를 복제
        // class를 사용할 때, 해당 class가 instance로 활용되려면 constructor가 있어야한다.
        // 여기에서는 PrintWriter에 constructor가 있을 것.
        PrintWriter p1 = new PrintWriter("result1.txt");
        p1.write("Hello 1");
        p1.close();

        PrintWriter p2 = new PrintWriter("result2.txt");
        p2.write("Hello 1");
        p2.close();
    }
}