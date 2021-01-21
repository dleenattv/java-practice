package tutoring02.prac;

public class NumberGame {
    public static void main(String[] args) {
        int randNum = (int)(Math.random() * 100)+1;
        System.out.println("1 - 100 사이의 정수를 생성했습니다.");
        System.out.println(randNum);
        NumberChecker numberChecker = new NumberChecker();
        int input = numberChecker.input();

        while (true) {
            if (input == randNum) {
                System.out.println("맞췄습니다.");
                break;
            } else {
                if (input >= 1 && input <= 100) {
                    if (input > randNum) {
                        System.out.println("더 작은 수입니다.");
                    } else {
                        System.out.println("더 큰 수입니다.");
                    }
                }
                input = numberChecker.input();
            }
        }
    }
}
