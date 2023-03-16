package Unit5;
public class Box {
    private int width;
    private int length;
    private int height;
    private int volume;

    public Box(int argWidth, int argLength, int argHeight) {
        width  = argWidth;
        length = argLength;
        height = argHeight;
        volume = width * length * height;
    }

    public int getVolume() {
        return volume;
    }
}
