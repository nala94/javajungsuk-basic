package ch7;

public class FireEngine extends Car{
    void water() {
        System.out.println("water!!!");

    }

    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(car instanceof FireEngine);
        //  car는 FireEngine으로 형변환 할 수 없다.
        // 상속관계이지만 실제 객체는 Car의 객체이므로 water()메소드를 사용할 수 없다.

    }
}
