package tutoring03.prac;

public class Subjects {
    private String subject;
    private int score;

    public Subjects(String subject) {
        this.subject = subject;
        this.score = randNumMaker();
    }

    private int randNumMaker() {
        return (int)(Math.random() * 100)+1;
    }

    public int getScore() {
        return score;
    }
}
