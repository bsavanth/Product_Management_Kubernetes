package kubecluster.productmanagementbackend.Service;

import kubecluster.productmanagementbackend.DAO.ProductCategoryRepository;
import kubecluster.productmanagementbackend.DAO.ProductRepository;
import kubecluster.productmanagementbackend.Model.Product;
import kubecluster.productmanagementbackend.Model.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryService {

    @Autowired
    ProductCategoryRepository pcr;

    public List<ProductCategory> getProducts()
    {
        List<ProductCategory> productCategories = pcr.findAll();
        return productCategories;
    }

    public void createProduct(ProductCategory productCategory)
    {
        pcr.save(productCategory);
    }

    public void updateProduct(ProductCategory productCategory)
    {
        pcr.save(productCategory);
    }

    public void deleteProduct(ProductCategory productCategory)
    {
        pcr.delete(productCategory);
    }
}
