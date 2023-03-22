package unit6;
public class Test {
    public static void main(String[] args) {
        String s1 = "동해물과 백두산이"; // new String("동해물과 백두산이");
        char c = s1.charAt(5);
        System.out.println(c);
        String s2 = "동해물과 백두산이";
        boolean r = s1==s2;
        System.out.println(r);
        String s3 = new String("동해물과 백두산이");
        r = s1==s3;
        System.out.println(r);

        r = s3.equals(s1);
        System.out.println(r);

        s1 = new String("i love you");
        s2 = new String("I Love you");

        r = s1.equalsIgnoreCase(s2);
        System.out.println(r);
        
        
    }
}
