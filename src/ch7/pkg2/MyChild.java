package ch7.pkg2;

import ch7.pkg1.MyParent;

public class MyChild extends MyParent {
    public void printMembers() {
//        System.out.println(prv);
//        System.out.println(dft);
        System.out.println(prt);
        System.out.println(pub);
    }

}

class MyParentTest2 {
    public static void main(String[] args) {
        MyParent p = new MyParent();
//        System.out.println(p.prv); // 에러, 같은 클래스가 아님
//        System.out.println(p.dft); // 에러, 같은 패키지가 아님
//        System.out.println(p.prt); // 에러, 같은 패키지가 아니고, 자손클래스가 아님
        System.out.println(p.pub);
    }
}