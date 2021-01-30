package tutoring03.homework.ticketSellingSystem;

public class TicketOffice {
    private int money;
    private Ticket ticket;

    public void sellTicketTo(Audience audience) {
        money += audience.buy(ticket);
    }
}
