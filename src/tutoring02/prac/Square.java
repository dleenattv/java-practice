package tutoring02.prac;

public class Square {
    private double width;
    private double height;

    public Square(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public boolean isSquare() {
        return width == height;
    }
}
