package lk.ac.iit.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping
public class productController {
    @GetMapping("/{id}")
    public product getById(@PathVariable Long id) {
        return new product(id, "Laptop", 999.99);
    }
}

