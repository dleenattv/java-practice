package tutoring03.prac;

public class StringChecker {

// TODO : 문자열 s 가 숫자로만 구성이 되어 있고 길이가 4 이상 6 이하이면 true 를 반환

    public boolean check(String input) {
        boolean result = true;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
                continue;
            } else {
                result = false;
            }
        }

        if (input.length() < 4 || input.length() > 6) {
            result = false;
        }

        return result;
    }
}
