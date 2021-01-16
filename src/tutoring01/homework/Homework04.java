package tutoring01.homework;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 성적을 입력하세요 : ");
        double kor = sc.nextInt();
        System.out.print("영어 성적을 입력하세요 : ");
        double eng = sc.nextInt();
        System.out.print("수학 성적을 입력하세요 : ");
        double math = sc.nextInt();
        double sum = kor + eng + math;
        System.out.println("총합 : " + sum);
        if (sum < 210 || kor < 60 || eng < 60 || math < 60) {
            System.out.println("탈락");
        } else {
            System.out.println("합격");
        }
    }
}
