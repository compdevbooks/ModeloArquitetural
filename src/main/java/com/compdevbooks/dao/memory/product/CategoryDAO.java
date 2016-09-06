package com.compdevbooks.dao.memory.product;

import com.compdevbooks.dao.memory.AMemoryDAO;
import com.compdevbooks.entity.product.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryDAO extends AMemoryDAO<Category> {

    public List<Category> getByName(String name) {
        ArrayList<Category> categories = new ArrayList<>();
        for (Category c : database)
            if (c.getName().contains(name))
                categories.add(c);
        return categories;
    }

    public List<Category> getByDescription(String description) {
        ArrayList<Category> categories = new ArrayList<>();
        for (Category c : database)
            if (c.getDescription().contains(description))
                categories.add(c);
        return categories;
    }

    public List<Category> getByCategory(Category category) {
        ArrayList<Category> categories = new ArrayList<>();
        for (Category c : database) {
            Category aux = c;
            while (aux!=null) {
                if (aux.equals(category))
                    categories.add(c);
                aux = aux.getSuperCategory();
            }
        }
        return categories;
    }

}

