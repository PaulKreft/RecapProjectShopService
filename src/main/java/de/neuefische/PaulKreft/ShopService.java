package de.neuefische.PaulKreft;

import com.fasterxml.uuid.Generators;

import java.util.UUID;

public class ShopService {
    OrderListRepo orders;
    ProductRepo products;

    public void placeOrder(String id) {
        Product product = products.getProductById(id);
        if(product == null) {
            System.out.println("Sorry, the product you asked for is not available!");
            return;
        }

        UUID uuid = Generators.randomBasedGenerator().generate();

        Order order = new Order(uuid, product);

        orders.addOrder(order);
    }
}
