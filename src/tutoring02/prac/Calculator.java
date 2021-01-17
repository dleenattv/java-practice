package tutoring02.prac;

public class Calculator {

    public double calcSum(double kor, double eng, double math) {
        return kor + eng + math;
    }

    public double calcAvg(double kor, double eng, double math) {
        return calcSum(kor, eng, math)/3;
    }
}
