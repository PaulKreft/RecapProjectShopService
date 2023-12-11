package de.neuefische.PaulKreft;

import java.util.List;
import java.util.UUID;

public class ProductRepo {
    private List<Product> products;

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void removeAllProducts() {
        products.clear();
    }

    public Product getProductByUuid(UUID uuid) {
        List<Product> filteredById = products.stream().filter(product -> product.uuid().equals(uuid)).toList();

        if(filteredById.isEmpty()) {
            System.out.println("No product found with id " + uuid);
            return null;
        }

        return filteredById.get(0);
    }

    public List<Product> getAllProducts() {
        return products;
    }


}
