package tutoring02.example;

public class StudentClient {
    public static void main(String[] args) {
        Student younghee = new Student("younghee", 3);
        Student chulsu = new Student("chulsu", 2);

        younghee.study();
        chulsu.study();
    }
}
