package classpart;

public class Student {
    int studentID;
    String studentName;
    int grade;
    String address;

    // default 생성자.
    // Java compiler가 알아서 넣어준다.
    // 특징 : 매개변수가 없다.
    // 다른 생성자가 하나도 없으면 자동생성된다. (다른 생성자가 있으면 자동생성되지 않는다.)
    public Student() {}

    // 생성자 overloading
    public Student(int id, String name){
        studentID = id;
        studentName = name;
    }

    public void showStudentInfo() {
        System.out.println(studentName + "," + address);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    // main 함수이지 Student 클래스의 메소드가 아님.
    // JVM이 호출한다.
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.studentName = "이순신";
        studentLee.studentID = 100;
        studentLee.address = "서울시 영등포구 여의도동";

        Student studentKim = new Student();
        studentKim.studentName = "김유신";
        studentKim.studentID = 101;
        studentKim.address = "미국 산호세";

        studentLee.showStudentInfo();
        studentKim.showStudentInfo();
    }
}
