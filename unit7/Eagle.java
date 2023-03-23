package unit7;

public class Eagle extends Animal {
    private int wings;

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public void fly() {
        System.out.println("fly()가 호출되었음");
    }
}
