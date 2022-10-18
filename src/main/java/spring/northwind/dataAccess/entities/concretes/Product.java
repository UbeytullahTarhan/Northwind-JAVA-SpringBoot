package spring.northwind.dataAccess.entities.concretes;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ProductID")
	private int id;
	
	//@Column(name="CategoryID")
	//private int categoryId;
	
	@Column(name="ProductName")
	private String productName ;
	
	@Column(name="UnitPrice")
	private double unitPrice;
	
	
	@Column(name="UnitsInStock")
	private short unitsInStock;
	
	
	@Column(name="QuantityPerUnit")
	private String quantityPerUnit;

	@ManyToOne()
	@JoinColumn(name="CategoryID")
	private Category category;

}
