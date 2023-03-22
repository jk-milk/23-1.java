package unit6;
class StringTest {
    public static void main(String[] args) {

        // String 객체는 immutable입니다. mutable이 아닙니다.
        // String 객체의 값은 변경할 수 없다.
        String proverb = "A barking dog";
        String s1, s2, s3, s4;

        System.out.println(proverb.length());
        proverb.concat(" never Bites!");
        System.out.println(proverb); // A barking dog

        s1 = proverb.concat(" never Bites!");
        System.out.println(s1); // A barking dog never Bites!

        s2 = proverb.replace("ba", "BA");
        System.out.println(s2);

        s3 = proverb.substring(2, 3); // begin 포함, end 미포함
        System.out.println(s3);

        s4 = proverb.toUpperCase();
        System.out.println(s4);

        int x = 20;
        System.out.println("결과값은 " + x);

        System.out.println("100" + x);
        System.out.println(100+x);

        String s = "1234";
        int n = Integer.parseInt(s);

        double d = Double.parseDouble(s);

        Float.parseFloat(s);

        Long.parseLong(s);
    
    }
}