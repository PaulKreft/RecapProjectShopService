package de.neuefische.PaulKreft;

import com.fasterxml.uuid.Generators;

import java.util.UUID;

public class ShopService {
    OrderListRepo orders;
    ProductRepo products;

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
