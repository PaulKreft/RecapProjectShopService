package de.neuefische.PaulKreft;

import java.util.List;

public class ProductRepo {
    private List<Product> products;

    public void addProduct(Product newProduct) {
        products.add(newProduct);
    }

    public void removeProducts(Product newProduct) {
        products.remove(newProduct);
    }

    public Product getProductById(String id) {
        List<Product> filteredById = products.stream().filter(product -> product.id().equals(id)).toList();

        if(filteredById.isEmpty()) {
            System.out.println("No product found with id " + id);
            return null;
        }

        return filteredById.get(0);
    }

    public List<Product> getAllProduct(Product newProduct) {
        return products;
    }


}
