package Unit6;
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
}
