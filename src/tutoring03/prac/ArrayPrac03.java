package tutoring03.prac;

import java.util.Scanner;

public class ArrayPrac03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];

        for (int i = 1; i <= 10; i++) {
            System.out.print("양의 정수를 입력하세요. " + i + "번째 : ");
            nums[i-1] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (nums[i] % 3 == 0) {
                System.out.println("=== 3의 배수 ===");
                System.out.println(nums[i]);
            }
        }
    }
}
