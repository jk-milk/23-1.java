package Unit6;
public class CarTest {
    public static void main(String[] args) {
        
        Car myCar = new Car();
        myCar.changeGear(1);
        myCar.speedUp();
        System.out.println(myCar);

        myCar.gasMileage = 20;
        double distance = 100;
        System.out.println("distance만큼의 거리를 갈 때 필요한 연료의 양은 = " + myCar.howMuchFuel(distance)); 
    }
}
