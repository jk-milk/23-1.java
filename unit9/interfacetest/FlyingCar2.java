package unit9.interfacetest;

class MyCar {
  int speed;
  void setSpeed(int speed) {
    this.speed = speed;
  }
}

public class FlyingCar2 extends MyCar implements Flyable {
  @Override
  public void fly() {
    System.out.println("하늘을 나는 중");
  }

  public static void main(String[] args) {
    FlyingCar2 obj = new FlyingCar2();
    obj.setSpeed(300);
    obj.fly();
  }
}
