package tutoring01.prac;

public class MethodPrac3 {
    public static void main(String[] args) {
        printJjak();
    }

    private static void printJjak() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
