package tutoring02;

public class ObjectExample {

    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.setCreatedAt(20201213);
        System.out.println(computer.getCreatedAt());
        computer.setCreatedAt(20210101);
        System.out.println(computer.getCreatedAt());
    }
}
