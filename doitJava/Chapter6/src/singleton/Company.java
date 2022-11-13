package singleton;

public class Company {
    // 객체를 스스로 만들고 static으로 단 1개 만든다.
    private static Company instance = new Company();

    // 아무도 Company 생성자로 Company 인스턴스를 만들 수 없다.
    private Company() {}

    // static : 객체를 생성하지 않고 getInstance 메서드를 부를 수 있다.
    public static Company getInstance() {
        if (instance == null) {
            // 그럴 일 없지만 방어적으로 코딩
            instance = new Company();
        }
        return instance;
    }
}
