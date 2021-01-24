package tutoring02.homework;

public class Worker {
    private BoxOffice boxOffice;

    public void sell(Ticket ticket, int num) {
        long totalPrice = ticket.getPrice() * num;
        long sum = 0;

        if (num > 0 && boxOffice.getTotalTicket() > 0) {
            sum = totalPrice * num;
        } else {
            System.out.println("티켓 수량 미지정");
        }

        boxOffice.setMoney(sum);
    }
}
