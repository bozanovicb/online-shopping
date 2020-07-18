package net.b2.shoppingbackend.dao;

import java.util.List;

import net.b2.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);
}
