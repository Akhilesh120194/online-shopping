package com.akhilexpress.shoppingbackend.dao;

import java.util.List;

import com.akhilexpress.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	boolean addcategory(Category category);
	
	List<Category> list();

	 Category getId(int theId);
}
