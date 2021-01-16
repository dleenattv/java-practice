package tutoring01.homework;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double won = 1092.20;
        System.out.print("달러를 입력하세요. : ");
        int dollar = sc.nextInt();

        System.out.println(dollar + "달러 : " + won * dollar + "원");
    }
}
