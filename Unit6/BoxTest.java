package unit6;

public class BoxTest {
    public static void main(String[] args) {
        
        /*
        Box b = new Box(20, 20, 30);

        
        test.width = 20;
        test.length = 20;
        test.height = 30;
        System.out.println("상자의 가로, 세로, 높이는 " + test.width + " , " + test.length + " , " + test.height + "입니다.");
        

        System.out.println("상자의 부피는 " + b.getVolume() + "입니다.");
        */

        Box b1 = new Box(10, 23, 50);
        Box b2 = new Box(10, 30, 30);
        System.out.println("첫 번째 박스의 부피: " + b1.getVolume());
        System.out.println("두 번째 박스의 부피: " + b2.getVolume());

        Box largerBox = Box.whoIsLargerBox(b1, b2);
        boolean result = b1.isSameBox(b2);
        System.out.println("박스1과 박스2는 같다?:"+result);

        System.out.println("더 큰 박스의 부피: " + largerBox.getVolume());
    }
}
