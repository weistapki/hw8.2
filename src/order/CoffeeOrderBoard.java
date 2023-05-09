package order;

import java.util.LinkedList;
import java.util.Queue;

public class CoffeeOrderBoard {
    Queue<Order> orders = new LinkedList<>();

    public void add(String name) {
        orders.add(new Order(orders.size()+1, name));
    }

    public Order deliver() {
        return orders.poll();
    }

    public Order deliver(int number) {
        for (Order order : orders) {
            if (order.getNumber() == number) {
                orders.remove(order);
                return order;
            }
        }
        return null;
    }
    public void draw() {
        System.out.println("=======================\n Num   |   Name");
        for (Order order : orders) {
            System.out.println("  " + order.getNumber() + "    |   " +
                    order.getName());
        }
    }
    @Override
    public String toString() {
        return "CoffeeOrderBoard{" +
                "queueOfOrders=" + orders +
                '}';
    }

}
