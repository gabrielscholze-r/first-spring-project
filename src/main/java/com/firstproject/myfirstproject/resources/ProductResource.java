package com.firstproject.myfirstproject.resources;

import com.firstproject.myfirstproject.entities.Product;
import com.firstproject.myfirstproject.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController //define recurso rest
@RequestMapping("/products") //caminho de requisição
public class ProductResource {

    @Autowired
    private ProductRepository ProductRepository;

    @GetMapping // gets no caminho /categorios chamarao o metodo abaixo
    public ResponseEntity<List<Product>> findAll() {
		List<Product> list = ProductRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}") // caminho adicional de id
    public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product cat = ProductRepository.findById(id);
        return ResponseEntity.ok().body(cat);
    }
}