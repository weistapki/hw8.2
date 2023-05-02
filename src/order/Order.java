package order;


public class Order {
    private final int number;
    private final String name;

    public Order(int orderNumber, String clientName) {
        this.number = orderNumber;
        this.name = clientName;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + number +
                ", clientName='" + name + '\'' +
                '}';
    }

}
