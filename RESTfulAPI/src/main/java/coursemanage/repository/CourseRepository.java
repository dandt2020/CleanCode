package coursemanage.repository;

import coursemanage.entity.Course;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Integer> {
    @Query("SELECT c FROM Course c WHERE c.name LIKE %:name%")
    List<Course> findByNameLike(@Param("name") String name, Sort by);
}
