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

    public void createProductCategory(ProductCategory productCategory)
    {
        pcr.save(productCategory);
    }

    public void updateProductCategory(ProductCategory productCategory)
    {
        pcr.save(productCategory);
    }

    public void deleteProductCategory(Long id)
    {
        pcr.deleteById(id);
    }

}
