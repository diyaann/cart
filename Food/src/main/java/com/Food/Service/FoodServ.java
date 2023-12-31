package com.Food.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Food.Entity.Food;
@Service
public interface FoodServ {
	public void addFoodItem(Food foodItem);

	public List<Food> getAllFoodItems();
	public void deleteFoodItem(int id);

	public List<Food> getFoodItemsByCategory(String category);

}
