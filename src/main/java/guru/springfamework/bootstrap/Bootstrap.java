package guru.springfamework.bootstrap;

import guru.springfamework.domain.Category;
import guru.springfamework.repositories.CategoryRepository;
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
        fruits.setName("Dried");

        Category fresh=new Category();
        fruits.setName("Fresh");

        Category exotic=new Category();
        fruits.setName("Exotic");

        Category nuts=new Category();
        fruits.setName("Nuts");

        categoryRepository.save(fruits);
        categoryRepository.save(dried);
        categoryRepository.save(fresh);
        categoryRepository.save(nuts);
        categoryRepository.save(exotic);


        System.out.println("Date loaded for categories : "+ categoryRepository.count());

    }
}
