
        package lk.ac.iit.products_api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>();

    private Long nextId = 1L;

    // Constructor: Add sample products
    public ProductService() {

        // Add a digital product
        products.add(new DigitalProduct(
                nextId++,
                "Clean Code (E-book)",
                29.99,
                "/downloads/clean-code.pdf",
                4.2
        ));

        // Add a physical product
        products.add(new PhysicalProduct(
                nextId++,
                "27-inch Monitor",
                249.99,
                5.4,
                "61cm x 41cm x 18cm"
        ));
    }

    // Get all products
    public List<Product> getAllProducts() {
        return products;
    }

    // Add a product
    public Product addProduct(Product product) {
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    // Get a product by ID
    public Optional<Product> getProductById(Long id) {
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst();
    }

    // Delete a product by ID
    public void deleteProduct(Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }

    // Search products by name
    public List<Product> findByName(String name) {
        return products.stream()
                .filter(product -> product.getName() != null
                        && product.getName().contains(name))
                .toList();
    }
}

