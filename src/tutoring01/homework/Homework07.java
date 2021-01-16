package tutoring01.homework;

import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 10개를 입력해주세요.");
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("정수를 입력해주세요. (" + i + "번째) : ");
            int input = sc.nextInt();
            if ( i % 2 == 0) {
                sum += input;
            }
        }

        System.out.println("양수의 총합 : " + sum);
    }
}
