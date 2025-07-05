package vendas.Vendedor.Food;

import java.math.BigDecimal;

public record FoodRequestDTO(String title, String image, BigDecimal price) {
}
