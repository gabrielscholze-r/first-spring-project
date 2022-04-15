package com.firstproject.myfirstproject.repositories;

import com.firstproject.myfirstproject.entities.Category;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository

public class CategoryRepository {

    private Map<Long, Category> map = new HashMap<>();

    public void save(Category obj) {
        map.put(obj.getId(), obj);
    }

    public Category findById(Long id) {
        return map.get(id);
    }

    public List<Category> findAll() {
        return new ArrayList<Category>(map.values());
    }
}