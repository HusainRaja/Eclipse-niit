package niit.com.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import niit.com.model.Category;

public interface CategoryDAO {
	public boolean addCategory(Category category);
	public boolean updateCategory(Category category);
	public boolean deleteCategory(Category category);
	public Category getCategory(int categoryId);
	public List<Category> listCategories();
}
