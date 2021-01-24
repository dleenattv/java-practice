package tutoring02.homework;

public class BoxOffice {
    private long money;
    private long totalTicket;

    public BoxOffice(long money, long totalTicket) {
        this.money = money;
        this.totalTicket = totalTicket;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public long getTotalTicket() {
        return totalTicket;
    }

    public void setTotalTicket(long totalTicket) {
        this.totalTicket = totalTicket;
    }
}
