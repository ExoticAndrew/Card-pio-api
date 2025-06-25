package vendas.Vendedor.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vendas.Vendedor.Food.Food;
import vendas.Vendedor.Food.FoodResponseDTO;
import vendas.Vendedor.Repository.Repository.foodRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping ("/food")
public class FoodController {
    @Autowired
    private foodRepository repository;
    @GetMapping
    public List<FoodResponseDTO> getALL(){
        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }
}
