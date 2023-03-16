package Unit5;
public class BoxTest {
    public static void main(String[] args) {
        
        Box b = new Box(20, 20, 30);

        /*
        test.width = 20;
        test.length = 20;
        test.height = 30;
        System.out.println("상자의 가로, 세로, 높이는 " + test.width + " , " + test.length + " , " + test.height + "입니다.");
        */

        System.out.println("상자의 부피는 " + b.getVolume() + "입니다.");
    }
}
