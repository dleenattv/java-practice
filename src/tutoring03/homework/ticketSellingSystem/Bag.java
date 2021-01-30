package tutoring03.homework.ticketSellingSystem;

public class Bag {
    private int invitation;
    private int money;
    private int ticketCount;

    public int hold(Ticket ticket) {
        if (invitation > 0) {
            return invitation;
        } else {
            minusMoney(ticket);
            return ticket.getPrice();
        }
    }

    private void minusMoney(Ticket ticket) {
        money -= ticket.getPrice();
    }
}
