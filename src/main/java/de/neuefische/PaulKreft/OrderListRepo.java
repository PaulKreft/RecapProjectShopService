package de.neuefische.PaulKreft;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo {
    private List<Order> orders;

    public OrderListRepo() {
        this.orders = new ArrayList<>();
    }


    public void addOrder(Order newOrder) {
        orders.add(newOrder);
    }

    public void removeOrder(Product newOrder) {
        orders.remove(newOrder);
    }

    public void removeAllOrders(Product newOrder) {
        orders.clear();
    }

    public Order getOrderById(String id) {
        List<Order> filteredById = orders.stream().filter(product -> product.id().equals(id)).toList();

        if (filteredById.isEmpty()) {
            System.out.println("No order found with id " + id);
            return null;
        }

        return filteredById.get(0);
    }

    public List<Order> getAllProducts() {
        return orders;
    }
}
