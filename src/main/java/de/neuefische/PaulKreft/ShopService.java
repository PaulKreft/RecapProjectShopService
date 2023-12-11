package de.neuefische.PaulKreft;

import java.util.UUID;

public class ShopService {
    OrderMapRepo orders;
    ProductRepo products;

    public ShopService(OrderMapRepo orders) {
        this.orders = orders;
    }

    public void placeOrder(UUID uuid) {
        Product product = products.getProductByUuid(uuid);
        if(product == null) {
            System.out.println("Sorry, the product you asked for is not available!");
            return;
        }

        Order order = new Order(uuid, product);

        orders.addOrder(order);
    }
}
