package webeng.gruppenprojekt.pbcbackend.repository;

import org.springframework.data.repository.CrudRepository;
import webeng.gruppenprojekt.pbcbackend.models.SuperCategory;

import java.util.List;


public interface SuperCategoryRepository extends CrudRepository<SuperCategory, Integer> {

    List<SuperCategory> findByScatName(String name);
}
