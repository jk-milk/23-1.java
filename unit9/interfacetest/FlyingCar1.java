package unit9.interfacetest;

interface Drivable{
  void drive();
}

interface Flyable{
  void fly();
}

public class FlyingCar1 implements Drivable, Flyable {
  @Override
  public void drive() {
    System.out.println("운전");
  }
  @Override
  public void fly() {
    System.out.println("하늘을 나는 중");
  }

  public static void main(String[] args) {
    FlyingCar1 obj = new FlyingCar1();
    obj.drive();
    obj.fly();
  }
}

