package unit6;

public class NewCar {
    private int speed;
    private String name;

    public NewCar() {
        System.out.println("속도는 " + speed);
    }

    // 인스턴스 초기화 블록(instance initialization block)
    {
        speed = 100;
    }

    public NewCar(String name) {
        this.name = name;
        System.out.println("속도는 " + speed);
    }

    public static void main(String[] args) {
        NewCar nCar = new NewCar();
        NewCar nCar2 = new NewCar("그랜저");
    }
}
