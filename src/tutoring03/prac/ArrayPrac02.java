package tutoring03.prac;

public class ArrayPrac02 {
    public static void main(String[] args) {
        int[] coinVariation = new int[]{500, 100, 50, 10};
        int[] count = new int[4];
        int exchange = 2680;

//        for (int i = 0; i < coinVariation.length; i++) {
        while (exchange > 0) {
            if (exchange >= coinVariation[0]) {
                count[0]++;
                exchange -= coinVariation[0];
            } else if (exchange >= coinVariation[1]) {
                count[1]++;
                exchange -= coinVariation[1];
            } else if (exchange >= coinVariation[2]) {
                count[2]++;
                exchange -= coinVariation[2];
            } else if (exchange >= coinVariation[3]){
                count[3]++;
                exchange -= coinVariation[3];
            } else {
                System.out.println("거스름돈이 10원 미만입니다.");
            }
        }

        System.out.println("500원 : " + count[0] + "개,");
        System.out.println("100원 : " + count[1] + "개,");
        System.out.println("50원 : " + count[2] + "개,");
        System.out.println("10원 : " + count[3] + "개");
    }

}
