package tutoring03.prac;

import java.util.Scanner;

public class ArrayPrac05 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 50, 3, 60, -3};
        int firstNum;
        int secNum;
        int tmpNum;
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 인덱스를 입력해주세요. (0-6사이): ");
        firstNum = scanner.nextInt();
        System.out.print("두번째 인덱스를 입력해주세요. (0-6사이): ");
        secNum = scanner.nextInt();
        if ((firstNum >= 0 && firstNum <= 6) && (secNum >= 0 && secNum <= 6)) {
            tmpNum = arr[firstNum];
            arr[firstNum] = arr[secNum];
            arr[secNum] = tmpNum;
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("입력한 인덱스가 범위에서 벗어납니다.");
        }
    }
}
