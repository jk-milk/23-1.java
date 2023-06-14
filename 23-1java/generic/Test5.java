package generic;

import java.util.*;

public class Test5 {
  public static void main(String[] args) {
    Professor p1 = new Professor("홍길동", 40);
    Professor p2 = new Professor("박길동", 34);
    Professor p3 = new Professor("고길동",46);
    Professor p4 = new Professor("이길동", 53);
    Professor p5 = new Professor("최길동", 28);

    List<Professor> list = new ArrayList<>();
    list.add(p1);
    list.add(p2);
    list.add(p3);
    list.add(p4);
    list.add(p5);

    print(list);
    System.out.println("정렬 후");
    // Professor 클래스를 변경하지 말고, list에 들어있는 Professor 객체들을
    // 나이의 오름차순으로 정렬하여 출력
    // 유명클래스, 무명클래스, 람다의 3가지 방법으로 각각 구현
    // Collections.sort(list); 는 컴파일 오류 - Comparable 인터페이스가 Professor 클래스 내부에 구현되어 있지 않기 때문에

    // 유명 클래스 Collections.sort(list, new MyComparator2());\
    // 무명 클래스
    // Collections.sort(list, new Comparator<Professor>() {
    //   public int compare(Professor p1, Professor p2) {
    //     return -(p1.age - p2.age);
    //   }
    // });
    Collections.sort(list, (o1, o2) -> o1.age-o2.age);
    print(list);


  }

  public static void print(List<Professor> list) {
    for (Professor p : list) {
      System.out.println(p.name + "," + p.age);
    }
    System.out.println();
  }
}

class MyComparator2 implements Comparator<Professor> {

  @Override
  public int compare(Professor p1, Professor p2) {
    return p1.age - p2.age;
  }
}
