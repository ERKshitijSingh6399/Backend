package com.app.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.app.model.Products;

public interface ProductsRepository extends JpaRepository<Products, Integer>{

}
