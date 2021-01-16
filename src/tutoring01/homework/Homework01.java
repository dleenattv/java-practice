package tutoring01.homework;

public class Homework01 {
    public static void main(String[] args) {
        int orginMoney = 500;
        int interest = 1;
        int days = 5;

        for (int i = 0; i < days; i++) {
            orginMoney += interest;
        }

        System.out.println(days + "일 후 잔액 : " + orginMoney);
    }
}
