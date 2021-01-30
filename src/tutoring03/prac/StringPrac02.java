package tutoring03.prac;

public class StringPrac02 {
    public static void main(String[] args) {
        String str = "abcdefg";
        StringBuffer sb = new StringBuffer(str);
        StringBuffer reverse = sb.reverse();
        System.out.println(reverse);
    }
}
