package tutoring03.interfaceExample;

public class TwoRoom implements Room{

    private int roomNumber;
    private String type;

    public TwoRoom(int roomNumber, String type) {
        this.roomNumber = roomNumber;
        this.type = type;
    }

    @Override
    public void printNumber() {
        System.out.println("TwoRoom : " + roomNumber);
    }

    @Override
    public void printType() {
        System.out.println("Type : " + type);
    }
}
