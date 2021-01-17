package tutoring02.prac;

public class NumberGame {
    public static void main(String[] args) {
        int randNum = (int)(Math.random() * 100)+1;
        System.out.println("1 - 100 사이의 정수를 생성했습니다.");
        System.out.println(randNum);
        NumberChecker numberChecker = new NumberChecker(randNum);
        numberChecker.input();
        numberChecker.checkNum();
    }
}
