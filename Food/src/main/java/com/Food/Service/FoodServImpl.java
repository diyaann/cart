package com.Food.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Food.Entity.Food;
import com.Food.Repository.FoodRepo;

@Service
public class FoodServImpl implements FoodServ{
	@Autowired
	private FoodRepo foodRepository;
	
	@Override
	public void addFoodItem(Food foodItem) {
		// TODO Auto-generated method stub
		foodRepository.save(foodItem);
	}
	@Override
	public List<Food> getAllFoodItems() {
		// TODO Auto-generated method stub
		return foodRepository.findAll();
	}
	@Override
	public void deleteFoodItem(int id) {
		foodRepository.deleteById(id);
	}
	@Override
	public List<Food> getFoodItemsByCategory(String category) {
		// TODO Auto-generated method stub
		return foodRepository.findByCategory(category);
	}
}
