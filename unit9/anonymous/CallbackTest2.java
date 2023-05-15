package anonymous;

import interfacetest.RemoteControl;

public class CallbackTest2 {
  public void remoteControl(RemoteControl rc) {
    rc.turnOn();
  }
  public static void main(String[] args) {
    CallbackTest2 cb = new CallbackTest2();
    // 무명 클래스로 RemoteControl 객체를 인자로 전달하시오.
    // 화면에는 파나소닉 테레비가 켜졌습니다.
    cb.remoteControl(null);
  }
}
