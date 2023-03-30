package unit7;

class Base {
    public Base() {
        System.out.println("Base() 생성자");
    }

    public Base(String a) {}
}

class Derived extends Base {
    public Derived() {
        // 부모 클래스의 생성자를 명시적으로 호출하지 않으면 묵시적으로 호출됨.
        //  이 때 호출되는 생성자는 인자가 없는 기본 생성자
        super();
        System.out.println("Derived() 생성자");
    }
}

public class Test {
    public static void main(String[] args) {
        Derived r = new Derived();
    }
}
