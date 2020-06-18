package org.flauschhaus.broccoli.category;

import androidx.lifecycle.LiveData;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class CategoryRepository { //TODO add unit test

    private CategoryDAO categoryDAO;
    private LiveData<List<Category>> allCategories;

    @Inject
    CategoryRepository(CategoryDAO categoryDAO) {
        this.categoryDAO = categoryDAO;
        allCategories = categoryDAO.findAll();
    }

    public LiveData<List<Category>> findAll() {
        return allCategories;
    }

    public void delete(Category category) {
        CompletableFuture.runAsync(() -> categoryDAO.delete(category));
    }

    public void insertOrUpdate(Category category) {
        if (category.getCategoryId() == 0) {
            CompletableFuture.runAsync(() -> categoryDAO.insert(category));
        } else {
            CompletableFuture.runAsync(() -> categoryDAO.update(category));
        }
    }

}
