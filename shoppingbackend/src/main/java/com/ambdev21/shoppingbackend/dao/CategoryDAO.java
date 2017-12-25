package com.ambdev21.shoppingbackend.dao;

import java.util.List;

import com.ambdev21.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
}
