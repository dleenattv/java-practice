package tutoring02.prac;

public class ReverseString {
    public static void main(String[] args) {
        String text = "abcdefg";

        for (int i = text.length()-1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }
}
