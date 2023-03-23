package unit7;

public class SportsCarTest {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.setSpeed(150);
        sc.setTurbo(true);

        System.out.println("speed[" + sc.getSpeed() + "], turbo[" + sc.isTurbo() + "]");

    }
}
