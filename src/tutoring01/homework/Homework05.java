package tutoring01.homework;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1부터 12까지의 정수를 입력하세요. : ");
        int season = sc.nextInt();

        if (season >= 1 && season <= 12) {
            switch (season) {
                case (12):
                case (1):
                case (2):
                    System.out.println("겨울");
                    break;
                case (3):
                case (4):
                case (5):
                    System.out.println("봄");
                    break;
                case (6):
                case (7):
                case (8):
                    System.out.println("여름");
                    break;
                case (9):
                case (10):
                case (11):
                    System.out.println("가을");
                    break;
            }
        } else {
            System.out.println("해당되는 계절이 없습니다.");
        }
    }
}
