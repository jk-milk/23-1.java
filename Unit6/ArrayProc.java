package unit6;

import java.util.Scanner;

public class ArrayProc {

    public static void inc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 1;
        }
    }

    // 사용자에게 값을 입력받는 메소드
    public static void setValues(int[] array) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("성적을 입력하시오:");
            array[i] = sc.nextInt();
        }
    }

    // 매개변수 배열의 값의 평균을 double형으로 반환
    public static double getAverage(int[] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total/array.length;
    }

}
