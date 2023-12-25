package kubecluster.productmanagementbackend.Model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.id.factory.internal.AutoGenerationTypeStrategy;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;

@Table(name = "PRODUCT")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long productID;

    @ManyToOne @JoinColumn (name = "category_id", nullable = false)
    private ProductCategory category;


    private String productName;
    private Date expiryDate;
    private int quantity;
    private double price;







}
