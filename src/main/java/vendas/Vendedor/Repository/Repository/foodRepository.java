package vendas.Vendedor.Repository.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vendas.Vendedor.Food.Food;

public interface foodRepository extends JpaRepository<Food, Long> {
}
