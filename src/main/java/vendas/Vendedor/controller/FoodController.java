package vendas.Vendedor.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vendas.Vendedor.Food.Food;
import vendas.Vendedor.Food.FoodRequestDTO;
import vendas.Vendedor.Food.FoodResponseDTO;
import vendas.Vendedor.Repository.Repository.foodRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping ("/food")
public class FoodController {
    @Autowired
    private foodRepository repository;
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){
        Food foodData = new Food(data);
        repository.save(foodData);
        return;

    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDTO> getALL(){
        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }
}
