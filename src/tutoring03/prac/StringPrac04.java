package tutoring03.prac;

import java.util.Scanner;

public class StringPrac04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringChecker stringChecker = new StringChecker();
        boolean result = stringChecker.check(input);
        System.out.println(result);
    }
}
