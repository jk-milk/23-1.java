package unit7;

public class Lion extends Animal {
    private int legs;

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void roar() {
        System.out.println("roar()가 호출되었음");
    }
}
