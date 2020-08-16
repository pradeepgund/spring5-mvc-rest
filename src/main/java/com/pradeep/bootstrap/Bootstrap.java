package com.pradeep.bootstrap;

import com.pradeep.repositories.CategoryRepository;
import com.pradeep.domain.Category;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

    CategoryRepository categoryRepository;

    public Bootstrap(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Category fruits=new Category();
        fruits.setName("Fruits");

        Category dried=new Category();
        dried.setName("Dried");

        Category fresh=new Category();
        fresh.setName("Fresh");

        Category exotic=new Category();
        exotic.setName("Exotic");

        Category nuts=new Category();
        nuts.setName("Nuts");

        categoryRepository.save(fruits);
        categoryRepository.save(dried);
        categoryRepository.save(fresh);
        categoryRepository.save(nuts);
        categoryRepository.save(exotic);


        System.out.println("Date loaded for categories : "+ categoryRepository.count());

    }
}
