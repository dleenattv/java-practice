package tutoring03.homework;

import java.util.Scanner;

public class FileNames {

    public String input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("파일명과 확장자를 입력하세요. : ");
        return scanner.nextLine();
    }
}
