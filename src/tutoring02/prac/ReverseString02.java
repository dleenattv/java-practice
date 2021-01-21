package tutoring02.prac;

public class ReverseString02 {
    public static void main(String[] args) {
        String text = "abcdefg";

        StringBuffer sb = new StringBuffer(text);
        sb.reverse();

        for(int i = 0; i < text.length(); i++) {
            System.out.print(sb.charAt(i));
        }
    }
}
