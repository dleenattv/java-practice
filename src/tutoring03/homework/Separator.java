package tutoring03.homework;

public class Separator {

    public void separate(String fileName) {
        if (fileName.contains(".")) {
            System.out.println("파일명 : " + fileName.substring(0, fileName.lastIndexOf('.')));
            System.out.println("확장자 : " + fileName.substring(fileName.lastIndexOf('.') + 1));
        } else {
            System.out.println("알 수 없는 형식입니다.");
        }
    }
}
