/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.Dao.Custom.Impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import library.Dao.CrudUtil;
import library.Dao.Custom.CategoryDao;
import library.entity.CategoryEntity;

/**
 *
 * @author Nawanjana
 */
public class CategoryDaoImpl  implements CategoryDao {
    @Override
    public boolean create(CategoryEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO category VALUES(?,?,?,?)",  t.getBookId(),t.getName(),t.getAuthor(),t.getCategoryName());
    }

    @Override
    public boolean update(CategoryEntity t) throws Exception {
    return CrudUtil.executeUpdate("UPDATE category SET Name=?,Author=?,Name=? WHERE BookId = ?",  t.getName(),t.getAuthor(),t.getCategoryName(),t.getBookId());
    }

    @Override
    public boolean delete(String bookId) throws Exception {
       return CrudUtil.executeUpdate("DELETE FROM category WHERE BookId = ?", bookId);
}
    @Override
    public CategoryEntity get(String bookId) throws Exception {
      ResultSet rst = CrudUtil.executeQuery("SELECT * FROM category WHERE BookId = ?", bookId);
        if(rst.next()){
          
            CategoryEntity entity = new CategoryEntity(rst.getString("BookId"), 
                    rst.getString("Name"),rst.getString("Author"),rst.getString("CategoryName"));
            return entity;
        }
        return null;
    }
    
    @Override
        public ArrayList<CategoryEntity> getAll() throws Exception {
        ArrayList<CategoryEntity> categoryEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM category");
        while (rst.next()) {            
            CategoryEntity entity; 
            entity = new CategoryEntity(
                    rst.getString("BookId"), 
                    rst.getString("Name"),
                    rst.getString("Author"),
                    rst.getString("CategoryName"));
            categoryEntities.add(entity);
        }
        return categoryEntities;
    }
    
}