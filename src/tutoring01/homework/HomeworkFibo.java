package tutoring01.homework;

import java.util.ArrayList;

public class HomeworkFibo {
    public static void main(String[] args) {
        System.out.println(makeFibo(6));
    }

    public static int makeFibo(int num) {
        int result = 0;
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(1);

        if (num > 2) {
            for(int i = 1; i < num; i++) {
                numList.add(numList.get(i) + numList.get(i-1));
                result = numList.get(i+1);
            }
        } else {
            result = numList.get(num-1);
        }

        return result;
    }
}
