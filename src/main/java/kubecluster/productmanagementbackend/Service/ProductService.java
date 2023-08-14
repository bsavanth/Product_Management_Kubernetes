package kubecluster.productmanagementbackend.Service;

import kubecluster.productmanagementbackend.DAO.ProductRepository;
import kubecluster.productmanagementbackend.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaObjectRetrievalFailureException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository pr;

    public List<Product> getProducts()
    {
        List<Product> products = pr.findAll();
        return products;
    }

    public void createProduct(Product product)
    {
        pr.save(product);
    }

    public void updateProduct(Product product)
    {
        pr.save(product);
    }

    public void deleteProduct(Long id)
    {
        pr.deleteById(id);
    }





}
