package tutoring01.homework;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 성적을 입력하세요 : ");
        double kor = sc.nextInt();
        System.out.print("영어 성적을 입력하세요 : ");
        double eng = sc.nextInt();
        System.out.print("수학 성적을 입력하세요 : ");
        double math = sc.nextInt();
        double sum = kor + eng + math;
        double avg = sum / 3;
        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + avg);
        if (avg >= 80) {
            System.out.println("우");
        } else if (avg >= 70) {
            System.out.println("미");
        } else if (avg >= 60) {
            System.out.println("양");
        } else {
            System.out.println("가");
        }
    }
}
