package tutoring03.homework.ticketSellingSystem;

public class Theater {
    TicketSeller ticketSeller;

    public void enter(Audience audience) {
        ticketSeller.sellTo(audience);
    }
}
