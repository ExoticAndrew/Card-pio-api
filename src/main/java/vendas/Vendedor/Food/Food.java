package vendas.Vendedor.Food;

import jakarta.persistence.*;

@Table(name = "foods")
@Entity(name = "foods")
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
public class Food {
    private Long id;
    private String Title;
    private String image;
    private Integer price;

}
