package konradrudnicki.springframework.repositories;

import konradrudnicki.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
