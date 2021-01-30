package tutoring03.prac;

import java.util.Scanner;

public class StringPrac03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("휴대폰 번호를 입력하세요. ('-' 포함) : ");
        String phoneNumber = scanner.nextLine();

        if (phoneNumber.contains("-")) {
            String newNumber = phoneNumber.replace("-", "_");
            System.out.println(newNumber);
        } else {
            System.out.println("교체할 문자가 없습니다.");
        }
    }
}
