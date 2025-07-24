package soloProject.CoupleLog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import soloProject.CoupleLog.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
