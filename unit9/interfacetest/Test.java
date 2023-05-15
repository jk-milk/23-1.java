package interfacetest;

public class Test {
  public static void main(String[] args) {
    // String s1 = "ABC";
    // String s2 = "ABC";
    // System.out.println(s1.compareTo(s2));
    // Student std1 = new Student("일지매", "컴정");
    // Student std2 = new Student("홍길동", "컴정");
    // findLarger(std1, std2);
    // Car c1 = new Car("HyunDai", "Grandeur", 250, 5000);
    // Car c2 = new Car("GM", "Impala", 300, 4000);
    // Car c3 = new Car();
    // System.out.println(c3);

    // findLarger(c1, c2);

    Student[] stds = new Student[5];
    Student std1 = new Student("일지매", "컴정");
    stds[0] = std1;
    Student std2 = new Student("홍길동", "컴정");
    stds[1] = std2;
    Student std3 = new Student("김일곤", "컴정");
    stds[2] = std3;
    Student std4 = new Student("박수헌", "컴정");
    stds[3] = std4;
    Student std5 = new Student("안영진", "컴정");
    stds[4] = std5;

    for (Student std : stds) {
      System.out.println(std.getName());
    }
  }

  
  public static void findLarger(Comparable c1, Comparable c2) {
    if (c1.compareTo(c2) == 0) {
      System.out.println("같다.");
    } else if (c1.compareTo(c2) > 0) {
      System.out.println("첫번째가 크다.");
    } else {
      System.out.println("두번째가 크다.");
    }
  }
  
}