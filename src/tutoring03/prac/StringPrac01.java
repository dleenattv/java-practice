package tutoring03.prac;

public class StringPrac01 {
    public static void main(String[] args) {
        String str = "abcdefg";

        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
