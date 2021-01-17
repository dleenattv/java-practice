package tutoring02.prac;

public class CreatorPrac {
    public static void main(String[] args) {
        Song song1 = new Song("노래제목1", "가수1");
        Square square = new Square(10, 10);
        boolean result = square.isSquare();
        System.out.println(result);
    }
}
