package Unit5;
public class TelevisionTest {

    public static void main(String[] args) {
        
        /*Television myTV = new Television();
        myTV.channel = 7;
        myTV.volume = 9;
        myTV.isOn = true;
        */
        
        Television myTV = new Television(7, 9, true);
        myTV.print();
        int myCh = myTV.getChannel();

        System.out.println("현재 채널은 " + myCh + "입니다.");

        Television yourTV = new Television(11, 20, true);
        int yourChannel = yourTV.getChannel();
        System.out.println("현재 채널은 " + yourChannel + "입니다.");
    }
}