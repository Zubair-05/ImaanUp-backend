package ImaanUp.com.example.ImaanUp.Repository;

import ImaanUp.com.example.ImaanUp.Entity.Option;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OptionRepository extends JpaRepository<Option, Integer> {
}
