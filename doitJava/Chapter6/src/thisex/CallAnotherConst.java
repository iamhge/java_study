package thisex;

class Person {
    String name;
    int age;

    public Person() {
        // constructor에서 다른 constructor를 호출하는 this를 사용할 때는 위에 어떠한 statement도 올 수 없다.
        // 왜?
        // 생성자로 인해서 instance가 생성되고, 메모리가 잡힌다.
        // 그래서 this를 사용해서 instance를 initialize 하기도 전에 메모리에 무언가를 할당할 수 없다.
        // 생성되지 않은 메모리에 값을 assign하는 일이 일어날 수 있다.
        // 따라서 this는 가장 먼저 나타나는 statement여야한다.
        int i = 1; // <- error

        // default로 설정해줄 수 있다.
        this("이름없음", 1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person returnSelf() {
        return this;
    }
}

public class CallAnotherConst {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.name);
        System.out.println(p1.returnSelf());
    }
}
