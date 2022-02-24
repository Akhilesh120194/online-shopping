package com.akhilexpress.shoppingbackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.akhilexpress.shoppingbackend.dao.CategoryDAO;
import com.akhilexpress.shoppingbackend.dto.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDaoImpl implements CategoryDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	static List<Category> categories = new ArrayList<>();

	static {

		Category category1 = new Category();
		category1.setName("Television");
		category1.setId(1);
		category1.setDescription("Description for television");
		category1.setImageURL("CAT_1.png");
		categories.add(category1);

		Category category2 = new Category();
		category2.setName("Mobile");
		category2.setId(2);
		category2.setDescription("Description for Mobile");
		category2.setImageURL("CAT_2.png");
		categories.add(category2);

		Category category3 = new Category();
		category3.setName("Laptop");
		category3.setId(3);
		category3.setDescription("Description for Laptop");
		category3.setImageURL("CAT_3.png");
		categories.add(category3);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub

		return categories;
	}

	@Override
	public Category getId(int theId) {

		for (Category temp : categories) {
			if (temp.getId() == theId)
				return temp;
		}

		return null;
	}

	@Override
	public boolean addcategory(Category category) {
		// TODO Auto-generated method stub
		
		System.out.println("jjjjjjjjjjjjj");
		try {
			
			Session s1=sessionFactory.getCurrentSession();
			s1.persist(category);
			
			return true;
		} catch (Exception e) {
			return false;
		}
		
		
	}

}
