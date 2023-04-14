package unit7.staticoverriding;

public class Dog extends Animal {
  @Override
  public void sound() {
    System.out.println("Sound of Dog");
  }
}
