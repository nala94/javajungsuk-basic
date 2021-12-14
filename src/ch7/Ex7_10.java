package ch7;

public class Ex7_10 {
    public static void main(String[] args) {
        Unit[] group = {new Marine(), new Tank(), new Dropship()};

        for (Unit u : group) {
            u.move(100, 200);
        }


        Unit[] unitArr;
        unitArr = new Unit[]{new Marine(), new Marine()};
        // 배열의 초기화 - 선언부를 나눌 때 new Unit[] 생략불가

        System.out.println(unitArr.length);

    }
}

abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void stop() {/* 현재 위치에 정지 */}

}

class Marine extends Unit {
    void move(int x, int y) {
        System.out.println("Marine[x=" + x + ",y=" + y + "]");
    }
    void stimPack() { /* 스팀팩을 사용한다 */}
}
class Tank extends Unit {
    void move(int x, int y) {
        System.out.println("Tank[x=" + x + ",y=" + y + "]");
    }
    void changeMode() { /* 공격모드를 변환한다. */}
}
class Dropship extends Unit {
    void move(int x, int y) {
        System.out.println("Dropship[x=" + x + ",y=" + y + "]");
    }
}