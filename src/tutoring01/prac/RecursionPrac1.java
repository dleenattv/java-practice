package tutoring01.prac;

import java.util.Scanner;

public class RecursionPrac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력");
        int num = sc.nextInt();

        System.out.println(sum(num));
    }

    private static int sum(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + (sum(num - 1));
        }
    }
}
