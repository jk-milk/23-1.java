package unit6;
public class Box {
    private int width;
    private int length;
    private int height;

    public Box(int argWidth, int argLength, int argHeight) {
        width  = argWidth;  
        length = argLength;
        height = argHeight;
    }

    public int getVolume() {
        return width * length * height;
    }

    public static Box whoIsLargerBox(Box box1, Box box2) {
        if (box1.getVolume() > box2.getVolume()) {
            return box1;
        }       
        return box2;
    }

    /*
     * 인자로 주어지는 Box 객체와 동일한 너비와 높이를 가지는 Box인지 체크하는 메소드
     * 같으면 true, 다르면 false를 반환
     */
    public boolean isSameBox (Box box) {
        /*
         * 나의 width, length, height가 인자로 주어진 box의 그것과 모두 같으면 true를 반환
         * 그렇지 않으면 false를 반환
         */
        if (width == box.width && length == box.length && height == box.height)
            return true;
        return false;
    }
}
