package ch7;

public class Ex7_7 {
    public static void main(String args[]) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = (Car) fe;
//        System.out.println(car instanceof FireEngine); //true
        fe.water(); // 형변환을 해도 fe가 Car타입으로 바뀌진 않음
//        car.water(); // 에러

        fe2 = (FireEngine) car;
        fe2.water();
        // 형변환 가능 확인
        System.out.println(fe instanceof Car);




    }
}

class Car {
    String color;
    int door;

     void drive() {
         System.out.println("drivd, Brrr~");

     }

     void stop() {
         System.out.println("stop!!!");

     }
}