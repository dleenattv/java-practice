package tutoring01.prac;

import java.util.Scanner;

public class MethodPrac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 세개 입력 :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println("최대값 : " + maxCalc(num1, num2, num3));
    }

    private static int maxCalc(int num1, int num2, int num3) {
        int maxNum = 0;
        if (num1 > num2 && num1 > num3) {
            maxNum = num1;
        } else if (num2 > num1 && num2 > num3) {
            maxNum = num2;
        } else if (num3 > num1 && num3 > num2) {
            maxNum = num3;
        }
        return maxNum;
    }
}
