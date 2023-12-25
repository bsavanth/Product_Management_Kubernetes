package kubecluster.productmanagementbackend.Controller;

import kubecluster.productmanagementbackend.Model.Product;
import kubecluster.productmanagementbackend.Model.ProductCategory;
import kubecluster.productmanagementbackend.Service.ProductCategoryService;
import kubecluster.productmanagementbackend.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/product-category")
@RestController
public class ProductCategoryController {


    @Autowired
    ProductCategoryService pcs;

    @GetMapping("/getProductCategories")
    public ResponseEntity<Object> getProductCategories()
    {
        return new ResponseEntity<>(pcs.getProducts(), HttpStatus.OK);
    }

    @PostMapping("/createProductCategory")
    public ResponseEntity<Object> createProductCategory(@RequestBody ProductCategory productCategory)
    {
        pcs.createProductCategory(productCategory);

        return new ResponseEntity<>("Product is successfully created", HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> deleteProductCategory(@PathVariable("id") Long id)
    {
        pcs.deleteProductCategory(id);

        return new ResponseEntity<>("Product is successfully deleted", HttpStatus.OK);
    }

    @PostMapping("/updateProductCategory")
    public ResponseEntity<Object> updateProductCategory(@RequestBody ProductCategory productCategory)
    {
        pcs.updateProductCategory(productCategory);

        return new ResponseEntity<>(("Product details updated"), HttpStatus.OK);
    }


}
