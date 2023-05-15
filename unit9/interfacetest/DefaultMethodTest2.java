package interfacetest;

interface OperateCar {
  void start();
  void stop();
  void setSpeed(int speed);
  void turn(int degree);

  default public void fly() {
    System.out.println("하늘을 나는 중");
  }
}

class OldCar implements OperateCar {
  @Override
  public void start() {}
  @Override
  public void stop() {}
  @Override
  public void setSpeed(int speed) {}
  @Override
  public void turn(int degree) {}
}

public class DefaultMethodTest2 {
  public static void main(String[] args) {
    OldCar obj = new OldCar();
    obj.fly();
  }
}
