package unit9.interfacetest;

public class DirectionTest implements Direction {
  public static void main(String[] args) {
    System.out.println("North: " + Direction.NORTH);
    System.out.println("South: " + Direction.SOUTH); // 위 두개의 예는 implement 없이도 가능
    // Direction.EAST = 100; // 상수이기 때문에 값을 변경할 수 없다.

    // Direction 인터페이스를 구현하면, 그 클래스의 상수인 것처럼 아래와 같이 사용할 수 있다.
    System.out.println("EAST:" + EAST);
  }
}
