package staticex;

public class Student {
    private static int serialNum = 10000;
    int studentID;
    String studentName;

    public Student() {
        serialNum++;
        studentID = serialNum;
    }

    public static int getSerialNum() {
        // static method에서는 instance 변수를 선언할 수 없다.
        // [error] Non-static field 'studentName' cannot be referenced from a static context
        // 인스턴스 변수는 new로 객체가 할당될 때 생성된다.
        // 따라서 static 메소드 안에서 인스턴스 변수를 사용하면, 생성되지도 않은 변수를 넣는 꼴.
//        studentName = "홍길동"; // 멤버변수, 인스턴스 변수

        // 지역 변수는 getSerialNum() 메서드가 호출될 때 stack에 생성된다.
        // 메서드가 끝나면 없어진다.
        int i = 10; // 지역 변수는 무관하다.

        // static 변수는 공유되는 변수이므로 무관하다.
        return serialNum; // static 변수, 클래스 변수
    }
}
