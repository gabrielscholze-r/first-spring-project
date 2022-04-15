package com.firstproject.myfirstproject.resources;

import com.firstproject.myfirstproject.entities.Category;
import com.firstproject.myfirstproject.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController //define recurso rest
@RequestMapping("/categories") //caminho de requisição
public class CategoryResource {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping // gets no caminho /categorios chamarao o metodo abaixo
    public ResponseEntity<List<Category>> findAll() {
		List<Category> list = categoryRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}") // caminho adicional de id
    public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category cat = categoryRepository.findById(id);
        return ResponseEntity.ok().body(cat);
    }
}