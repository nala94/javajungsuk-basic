package ch9;

public class Ex9_16 {
    public static void main(String[] args) {
        int i = 10;

        // 기본형을 참조형으로 형변환 (형변환 생략가능)
        Integer intg = (Integer) i;
        Integer skipIntg = i;
        Object obj = i;
        Object obj2 = (Object) i;

        Long lng = 100L;

        int i2 = intg + 10; // 참조형과 기본형간의 연산 가능, 컴파일러가 자동으로 언박싱
        long l = intg + lng;

        Integer intg2 = new Integer(20);
        Integer intg2_1 = 20;
        int i3 = (int)intg2; // 참조형을 기본형으로 형변환도 가능 (형변환 생략가능)
        int i3_1 = intg2;
    }
}
