package com.example.React.repo;

import com.example.React.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

public List<Product> findByBrand(String brand);

}
