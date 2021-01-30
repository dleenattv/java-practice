package tutoring03.interfaceExample;

public class OneRoom implements Room{
    private int roomNumber;
    private String type;

    public OneRoom(int roomNumber, String type) {
        this.roomNumber = roomNumber;
        this.type = type;
    }

    @Override
    public void printNumber() {
        System.out.println("OneRoom : " + roomNumber);
    }

    @Override
    public void printType() {
        System.out.println("Type : " + type);
    }
}
