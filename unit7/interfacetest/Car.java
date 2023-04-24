package unit7.interfacetest;

public class Car implements Comparable {
  
  private String brand;
  private String model;
  private int speed;
  private int price;

  public Car(String brand, String model, int speed, int price){
    this.brand = brand;
    this.model = model;
    this.speed = speed;
    this.price = price;
  }

  public Car() {
    this("Unknown", "Unknown", 0, 0);
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }
  public String getBrand() {
    return brand;
  }

  public void setModel(String model) {
    this.model = model;
  }
  public String getModel() {
    return model;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }
  public int getSpeed() {
    return speed;
  }

  public void setPrice(int price) {
    this.price = price;
  }
  public int getPrice() {
    return price;
  }

  @Override
  public int compareTo(Comparable obj) {
    Car car = (Car) obj;
    // 차의 가격 비교를 하려면, Car 클래스의 getPrice 메소드를 호출해야 하므로
    // Comparable 타입으로 받은 인자를 Car 타입으로 하향 형변환.
    // 물론 이 obj 객체는 Car 클래스 타입의 객체여야만 함. (예외처리 필요)
    int objPrice = car.getPrice();
    if (price < objPrice) {
      return -1;
    } else if (price == objPrice) {
      return 0;
    } else {
      return 1;
    }
  }

  @Override
  public String toString() {
    return "[브랜드:"+brand+", 모델:"+model+", speed:"+speed+", price:"+price+"]";
  }
}
