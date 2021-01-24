package tutoring02.homework;

public class Cinema {
    private Worker worker;  // 필요한가?

    public void open() {
        Customer customer = new Customer(new Bag(10000, 0));
        customer.buyTicket(1);
    }
}
