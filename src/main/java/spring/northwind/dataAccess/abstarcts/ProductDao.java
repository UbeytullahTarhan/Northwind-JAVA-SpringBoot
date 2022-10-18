package spring.northwind.dataAccess.abstarcts;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import spring.northwind.dataAccess.entities.concretes.Product;

import java.util.List;

public interface ProductDao extends JpaRepository<Product, Integer> {
    Product getByProductName(String productName);
    Product getByProductNameAndCategory_CategoryID(String productName,int categoryId);

    List<Product> getByProductNameOrCategory_CategoryID(String productName,int categoryId);
    List<Product> getByCategory_CategoryIDIn(List<Integer> categories);
    List<Product> getByProductNameContains(String productName);
    List<Product> getByProductNameStartsWith(String productName);
    @Query("From Product where productName=:productName and category.categoryID=:categoryId")
    List<Product> getByNameAndCategory(String productName,int categoryId);




}
