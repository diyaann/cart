package com.Food.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Food.Entity.Food;
import com.Food.Service.FoodServImpl;


@RestController
public class FoodController {
	
	@Autowired
	FoodServImpl foodServ;
	@GetMapping("customer/foodItems")
	public List<Food> getAllFoodItemsCust() {
		return foodServ.getAllFoodItems();
	}
	
	@PostMapping("admin/foodItems")
	public String addFoodItem(@RequestBody Food foodItem) {
		foodServ.addFoodItem(foodItem);
		return "Hi admin Food Item " + foodItem.getFood_name() + " Has been addded";
	}
	@GetMapping("admin/foodItems")
	public List<Food> getAllFoodItems() {
		return foodServ.getAllFoodItems();
	}
	@DeleteMapping("admin/foodItems/{id}")
	public String deleteFoodItemById(@PathVariable("id") int id ) {
		foodServ.deleteFoodItem(id);
		return "Item deleted successfully";
	}
	@GetMapping("admin/foodItems/{category}")
	public List<Food> getFoodItemsByCategory(@PathVariable("category") String category) {
		return foodServ.getFoodItemsByCategory(category);
	}

}
