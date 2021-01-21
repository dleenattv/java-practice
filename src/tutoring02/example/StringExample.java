package tutoring02.example;

public class StringExample {

    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String concat = a.concat(b);
        System.out.println(concat);

        String c = "ccc";
        int length = c.length();
        System.out.println(length);

        String apple = "apple";
        String banana = "banana";
        if (apple.compareTo(banana) < 0) {
            System.out.println("apple 이 사전 순서상 앞선다");
        } else {
            System.out.println("banana 가 사전 순서상 앞선다");
        }
    }
}
