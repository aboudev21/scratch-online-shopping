package com.ambdev21.shoppingbackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ambdev21.shoppingbackend.dao.CategoryDAO;
import com.ambdev21.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories = new ArrayList<Category>();
	
	static{
		categories.add(new Category(1, "TV", "This is a description of the TV", "CAT_1.png", true));
		categories.add(new Category(2, "Mobile", "This is a description of the mobile", "CAT_2.png", true));
		categories.add(new Category(3, "Laptop", "This is a description of the laptop", "CAT_3.png", true));
	}
	
	@Override
	public List<Category> list() {
		return categories;
	}

	@Override
	public Category get(int id) {
		//enhance for loop
		for (Category category : categories) {
			if (category.getId() == id)
				return category;
		}
		return null;
	}

}
