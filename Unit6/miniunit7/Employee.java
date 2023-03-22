package unit6.miniunit7;

public class Employee {
    private String name;
    private double salary;

    private static int count = 0; 

    // 생성자
    public Employee(String n, double s) {
        name = n;
        salary = s;
        count++;
    }

    // 소멸자
    @Override
    protected void finalize() {
        count--;
    }

    // 정적 메소드
    public static int getCount() {
        return count;
    }
}
