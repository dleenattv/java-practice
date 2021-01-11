package tutoring01.prac;

import java.util.Scanner;

public class MethodPrac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 값 입력 :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(calc(num1, num2));
    }

    private static int calc(int num1, int num2) {
        return num1 + num2;
    }
}
