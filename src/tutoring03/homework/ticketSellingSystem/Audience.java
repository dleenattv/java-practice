package tutoring03.homework.ticketSellingSystem;

public class Audience {
    Bag bag;

    public int buy(Ticket ticket) {
        int ticketPrice = bag.hold(ticket);
        return ticketPrice;
    }
}
