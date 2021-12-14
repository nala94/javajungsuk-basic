package ch8;

import java.io.File;

public class Ex8_10 {
    public static void main(String[] args) {
        try {
            File f = createFile("");
            System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다");
        } catch (Exception e) {
            System.out.println(e.getMessage() + " 다시 입력해 주시기 바랍니다.");
        }
    }

    static File createFile(String fileName) throws Exception {
//        if (fileName == null || fileName.equals("")) {
//            throw new Exception("파일이름이 유효하지 않습니다.");
//        }
//        File f = new File(fileName);
//        f.createNewFile();
//        return f;

        try {
            if (fileName == null || fileName.equals(""))
                throw new Exception("파일이름이 유효하지 않습니다.");
        } catch (Exception e) {
            fileName = "제목없음.txt";
        }
        File f = new File(fileName);
        f.createNewFile();
        return f;

    }
    // 1. 직접 처리 (try-catch) 2. 예외 선언 (떠넘기기)
    // 작업을 시키 메서드 또는 작업을 수행하는 메소드 중 처리할쪽에서 try-catch를 한다.
}
