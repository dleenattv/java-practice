package tutoring01.prac;

import java.util.Scanner;

public class Prac3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 3개 입력: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int sum = num1 + num2 + num3;
        double avg = sum / 3;

        int maxNum = 0;
        int minNum = 0;

        if (num1 > num2) {
            maxNum = num1;
            minNum = num2;
            if (maxNum < num3) {
                maxNum = num3;
            }
            if (minNum > num3) {
                minNum = num3;
            }
        } else {
            maxNum = num2;
            minNum = num1;
            if (maxNum < num3) {
                maxNum = num3;
            }
            if (minNum > num3) {
                minNum = num3;
            }
        }

        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + avg);
        System.out.println("최대 : " + maxNum);
        System.out.println("최소 : " + minNum);
    }
}
