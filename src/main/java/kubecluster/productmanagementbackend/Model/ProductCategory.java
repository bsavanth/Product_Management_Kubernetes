package kubecluster.productmanagementbackend.Model;

import jakarta.persistence.*;
import lombok.*;
@Table
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long categoryId;

    private String categoryName;
}
