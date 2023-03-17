package Unit6;

public class ArrayProcTest {
    final static int STUDENTS = 5;
    public static void main(String[] args) {
        
        /*
        int[] list = { 1, 2, 3, 4, 5};
        ArrayProc obj = new ArrayProc();

        obj.inc(list);

        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        */

        int[] scores = new int[STUDENTS];
        ArrayProc.setValues(scores); // 사용자로부터 배열의 값을 입력받음
        System.out.println("평균은 = " + ArrayProc.getAverage(scores)); // 배열의 평균을 구하는 메소드를 사용해서 출력
    }
}
