package de.neuefische.PaulKreft;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class OrderListRepo {
    private List<Order> orders;

    public OrderListRepo() {
        this.orders = new ArrayList<>();
    }


    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public void removeAllOrders() {
        orders.clear();
    }

    public Order getOrderById(UUID uuid) {
        List<Order> filteredById = orders.stream().filter(product -> product.uuid().equals(uuid)).toList();

        if (filteredById.isEmpty()) {
            System.out.println("No order found with id " + uuid);
            return null;
        }

        return filteredById.get(0);
    }

    public List<Order> getAllProducts() {
        return orders;
    }
}
