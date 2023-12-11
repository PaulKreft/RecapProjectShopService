package de.neuefische.PaulKreft;

import java.util.List;
import java.util.UUID;

public interface OrderRepo {
    void addOrder(Order order);

    void removeOrder(Order order);

    void removeAllOrders();

    Order getOrderByUuid(UUID uuid);

    List<Product> getAllProducts();
}
