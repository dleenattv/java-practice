package tutoring02.example;

public class Student {
    private String name;
    private int ban;

    public Student(String name, int ban) {
        this.name = name;
        this.ban = ban;
    }

    public void study() {
        System.out.println("name : " + name + ", ban : " + ban);
    }
}
