package tutoring02.prac;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberChecker {

    int randNum;
    int num;

    public NumberChecker(int randNum) {
        this.randNum = randNum;
    }

    public int input() {
        //int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("생성된 정수를 맞춰보세요 : ");
        try {
            num = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("문자는 허용되지 않습니다.");
        } finally {
            System.out.println("check");
            checkNum();
        }
        System.out.println("result : " + num);
        return num;
    }

    public void checkNum() {
        System.out.println("num : " + num);
        System.out.println("randnum : " + randNum);

        while (true) {
            if (num == randNum) {
                System.out.println("생성된 정수 : " + randNum);
                System.out.println("입력한 정수 : " + num);
                System.out.println("숫자를 맞췄습니다.");
                break;
            } else {
                if (randNum > num) {
                    System.out.println("더 큰 수입니다.");
                } else {
                    System.out.println("더 작은 수입니다.");
                }
                this.input();
            }
        }
    }
}
