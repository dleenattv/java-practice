package tutoring02.prac;

import java.util.Scanner;

public class ChangeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("휴대폰 번호를 입력하세요. ('-'포함) : ");
        String phoneNumber = scanner.nextLine();

        if (phoneNumber.contains("-")) {
            String result = phoneNumber.replace("-", "_");
            System.out.println(result);
        } else {
            System.out.println("교체할 문자가 없습니다.");
        }
    }
}
