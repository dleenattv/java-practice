package tutoring03.homework.ticketSellingSystem;

public class TicketSeller {
    TicketOffice ticketOffice;

    public void sellTo(Audience audience) {
        ticketOffice.sellTicketTo(audience);
    }
}
