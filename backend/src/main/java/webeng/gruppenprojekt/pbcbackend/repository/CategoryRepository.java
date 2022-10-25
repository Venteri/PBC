package webeng.gruppenprojekt.pbcbackend.repository;

import org.springframework.data.repository.CrudRepository;
import webeng.gruppenprojekt.pbcbackend.models.Category;
import webeng.gruppenprojekt.pbcbackend.models.SuperCategory;

import java.util.List;

public interface CategoryRepository extends CrudRepository<Category, Integer> {

    List<Category> findByCatName(String name);
}
