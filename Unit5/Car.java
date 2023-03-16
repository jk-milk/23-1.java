package Unit5;
public class Car {
    String color;
    int gear;
    int speed;
    double gasMileage;

    @Override
    public String toString() {
        return "Car [color=" + color + ", speed=" + speed + " + gear=" + gear + "]";
    }

    void changeGear(int gear) {
        this.gear = gear;
    }

    void speedUp() {
        speed = speed + 10;
    }

    void speedDown() {
        speed = speed - 10;
    }

    double howMuchFuel(double distance) {
        return distance/gasMileage;
    }
}
