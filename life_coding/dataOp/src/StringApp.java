public class StringApp {
    public static void main(String[] args) {
        // java의 작은 따옴표는 character를 나타낸다.
        System.out.println("Hello World"); // String
//        System.out.println('Hello World'); // error
        System.out.println('c'); // Character

        // 줄바꿈
        System.out.println("Hello" +
                " World"); // 줄바꿈하고 싶으나, 결과보면 줄바꿈 안됨.
        System.out.println("Hello \nWorld");
    }
}
