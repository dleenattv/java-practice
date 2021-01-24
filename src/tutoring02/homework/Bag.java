package tutoring02.homework;

public class Bag {
    private long money;
    private Ticket ticket;
    private int ticketMount;
    private long invitation;

    public Bag(long money, long invitation) {
        this.money = money;
        this.invitation = invitation;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public int getTicketMount() {
        return ticketMount;
    }

    public void setTicketMount(int ticketMount) {
        this.ticketMount = ticketMount;
    }

    public long getInvitation() {
        return invitation;
    }

    public void setInvitation(long invitation) {
        this.invitation = invitation;
    }
}