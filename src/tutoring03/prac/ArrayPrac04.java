package tutoring03.prac;

import java.util.Scanner;

public class ArrayPrac04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("과목명을 입력하세요. : ");
        String sc = scanner.nextLine();

        while (!sc.equalsIgnoreCase("stop")) {
            Subjects subjects = new Subjects(sc);
            System.out.println(subjects.getScore());
            System.out.print("과목명을 입력하세요. : ");
            sc = scanner.nextLine();
        }
    }
}
