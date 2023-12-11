package de.neuefische.PaulKreft;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class OrderMapRepo implements OrderRepo {
    private Map<UUID, Order> orders;
    public void addOrder(Order order) {
        orders.put(order.uuid(), order);
    };

    public void removeOrder(Order order) {
        orders.remove(order.uuid(), order);
    };

    public void removeAllOrders() {
        orders.clear();
    };

    public Order getOrderByUuid(UUID uuid) {
        return orders.get(uuid);
    };

    public Map<UUID, Order> getAllProducts() {
        return orders;
    };
}
