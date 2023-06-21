package com.Food.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Food.Entity.Food;



@Repository
public interface FoodRepo extends JpaRepository<Food, Integer> {
	List<Food> findByCategory(String category);

}
