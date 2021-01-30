package tutoring03.homework.ticketSellingSystem;

public class Ticket {
    private String title;
    private int price;

    public Ticket(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }
}
