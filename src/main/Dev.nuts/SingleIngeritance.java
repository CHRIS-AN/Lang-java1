
// 단일 상속

/*
    다른 객체지향언어인 C++에서는 여러 조상 클래스로부터 상속 받는 것이 가능한 '다중상속을 허용하지만, 자바에서는 오직 단일 상속만을 허용한다.
    그래서 둘 이상의 클래스로부터 상속을 받을 수 없다.
*/

class Tv {
    boolean power; // 전원 상태 (on/off)
    int channel;

    void power() { power = ! power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

class VCR {
    boolean power;
    int counter = 0;
    void power() { power = ! power; }
    void play() {}
    void stop() {}
}

class TVCR extends Tv {
    VCR vcr = new VCR();

    void play() {
        vcr.play();
    }

    void stop() {
        vcr.stop();
    }
}

/*

    자바는 다중상속을 허용하지 않으므로 TV클래스를 조상으로 하고, VCR 클래스는 TVCR클래스에 포함시켰다.
    그리고 TVCR클래스의 메서드와 일치하는 선언부를 가진 메서드를 선언하고 내용은 VCR클래스의 것을 호충해서 사용하도록 하였다.

*/
public class SingleIngeritance {

}