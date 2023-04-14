package unit7.finalclass;

public class FinalTest {
 
  // 바둑관련 클래스라고 가정
  // getFirstPlayer는 바둑에서 첫 번째 돌을 반환한다.
  // 그런데 바둑에서는 첫번째 돌은 무조건 흑돌이어야 한다.
  public final String getFirstPlayer() {
    return "BLACK";
  }
}
