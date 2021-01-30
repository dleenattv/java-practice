package tutoring03.prac;

public class ArrayPrac01 {


    public static void main(String[] args) {
        int[] arr = {94, 85, 95, 88, 90};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
    }

}
