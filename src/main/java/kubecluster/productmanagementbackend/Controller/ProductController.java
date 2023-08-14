package kubecluster.productmanagementbackend.Controller;

import kubecluster.productmanagementbackend.Model.Product;
import kubecluster.productmanagementbackend.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.observation.ObservationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")

public class ProductController {

    @Autowired
    ProductService ps;

    @GetMapping("/getProducts")
    public ResponseEntity<Object> getProducts()
    {
        return new ResponseEntity<>(ps.getProducts(), HttpStatus.OK);
    }

    @PostMapping("/createProduct")
    public ResponseEntity<Object> createProduct(@RequestBody Product product)
    {
        ps.createProduct(product);

        return new ResponseEntity<>("Product is successfully created", HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> deleteProduct(@PathVariable("id") Long id)
    {
        ps.deleteProduct(id);

        return new ResponseEntity<>("Product is successfully deleted", HttpStatus.OK);
    }

    @PostMapping("/updateProduct")
    public ResponseEntity<Object> updateProduct(@RequestBody Product product)
    {
        ps.updateProduct(product);

        return new ResponseEntity<>(("Product details updated"), HttpStatus.OK);
    }



}
