package spring.northwind.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import spring.northwind.business.abstracts.ProductService;


import spring.northwind.core.utilities.results.DataResult;
import spring.northwind.core.utilities.results.Result;
import spring.northwind.dataAccess.entities.concretes.Product;

import java.util.*;

@RestController
@RequestMapping("api/products/")
public class ProductsController {
	private ProductService productService;
		
	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}


	@GetMapping("getall")
	public DataResult<List<Product>> getAll() {

		return this.productService.getAll();
	}

	@PostMapping("add")
	public Result add(@RequestBody Product product){
		return  this.productService.add(product);
	}

	@GetMapping("getByProductName")
	public DataResult<Product> getByProductName(@RequestParam  String productName) {

		return this.productService.getByProductName(productName);
	}
	@GetMapping("getByProductNameAndCategory")
	public DataResult<Product> getByProductNameAndCategory(@RequestParam("productName")  String productName,@RequestParam("categoryId") int categoryId) {

		return this.productService.getByProductNameAndCategory(productName,categoryId);
	}
	@GetMapping("getByProductNameContains")
	public DataResult<List<Product>> getByProductNameContains(@RequestParam("productName")  String productName) {

		return this.productService.getByProductNameContains(productName);
	}
}
