package it.univr2.JPA.controllor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.univr2.JPA.entity.Product;
import it.univr2.JPA.services.ProductService;

@RestController
public class ProductControllor {

    @Autowired
    private ProductService service;

    @PostMapping("addProduct")
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    @PostMapping("addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return service.saveProducts(products);
    }

    @PostMapping("")
    public List<Product> findAll() {
        return service.getProducts();
    }

}
