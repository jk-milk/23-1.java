package interfacetest;

public class AutoCarTest {
  public static void main(String[] args) {
    OperateCar obj = new AutoCar();
    obj.start();
    obj.setSpeed(200);
    obj.turn(15);
    obj.stop();
  }
}
