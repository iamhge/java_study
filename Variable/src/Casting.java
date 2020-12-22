public class Casting {
    public static void main(String[] args) {
        // int -> double
        // 자동형변환
        double a = 1.1;
        double b = 1; // 자동형변환

        System.out.println(b); // b에 정수 1을 입력했으나, 1.0으로 출력됨

        // double -> int
        // 값의 손실 있는 경우에는 자동형변환 안됨.
//        int c = 1.1; // double 형을 int로 바꿀 수는 없다. 0.1을 잃어버릴 수 있으므로
        int d = (int) 1.1; // double -> int로 casting
        System.out.println(d); // 1

        // int -> String
        String e = Integer.toString(1);
        System.out.println(e.getClass()); // getClass : data type 출력
    }
}
