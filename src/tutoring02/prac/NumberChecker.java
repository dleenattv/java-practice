package tutoring02.prac;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberChecker {

    int num;

    public int input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("생성된 정수를 맞춰보세요 : ");
        try {
            num = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("문자는 허용되지 않습니다.");
        }
        return num;
    }
}
