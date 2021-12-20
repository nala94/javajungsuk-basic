package ch9;

import java.util.ArrayList;

public class AutoBoxingTest {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(new Integer(100)); //Unnecessary boxing 'new Integer(100)'
        list.add(100);

        Integer i = list.get(0);
        Integer i2 = list.get(0).intValue(); //Unnecessary unboxing 'list.get(0).intValue()'
        
        // 오토박싱&언박싱 : 기본형과 참조형간의 자동변환 by 컴파일러
    }
}
