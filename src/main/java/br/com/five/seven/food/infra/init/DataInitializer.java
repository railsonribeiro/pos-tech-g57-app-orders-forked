package br.com.five.seven.food.infra.init;

import br.com.five.seven.food.adapter.out.relational.entity.CategoryEntity;
import br.com.five.seven.food.adapter.out.relational.repository.CategoryRepository;
import br.com.five.seven.food.application.domain.enums.CategoryName;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class DataInitializer implements CommandLineRunner {

    private final CategoryRepository categoryRepository;

    public DataInitializer(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (categoryRepository.count() == 0) {
            categoryRepository.save(new CategoryEntity(
                    1L,
                    CategoryName.SNACK.getName(),
                    true
            ));
            categoryRepository.save(new CategoryEntity(
                    2L,
                    CategoryName.GARNISH.getName(),
                    true
            ));
            categoryRepository.save(new CategoryEntity(
                    3L,
                    CategoryName.DRINK.getName(),
                    true
            ));
            categoryRepository.save(new CategoryEntity(
                    4L,
                    CategoryName.DESSERT.getName(),
                    true
            ));
        }
    }
}
