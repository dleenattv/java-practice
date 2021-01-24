package tutoring02.homework;

public class Customer {

    private Bag bag;

    public Customer(Bag bag) {
        this.bag = bag;
    }

    public void buyTicket(int num) {
        long totalPrice = bag.getTicket().getPrice() * num;

        if (totalPrice <= bag.getMoney()) {
            bag.setTicketMount(bag.getTicketMount() + num);
            bag.setMoney(bag.getMoney() - totalPrice);
        } else {
            System.out.println("금액부족");
        }
    }
}
