package spring.northwind.dataAccess.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Categories")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "products"})
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CategoryID")
    private int  categoryID;

    @Column(name="CategoryName")
    private String categoryName;

    @OneToMany(mappedBy = "category")
    private List<Product> products;



}
