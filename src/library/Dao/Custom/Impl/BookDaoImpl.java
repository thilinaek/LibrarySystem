/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.Dao.Custom.Impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import library.Dao.CrudUtil;
import library.Dao.Custom.BookDao;
import library.entity.BookEntity;

/**
 *
 * @author Nawanjana
 */
public class BookDaoImpl implements BookDao{
  @Override
    public boolean create(BookEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO books VALUES(?,?,?)",  t.getBookId(),t.getName(),t.getAuthor());
    }

    @Override
    public boolean update(BookEntity t) throws Exception {
    return CrudUtil.executeUpdate("UPDATE books SET Name=?,Author=? WHERE BookId = ?",  t.getName(),t.getAuthor(),t.getBookId());
    }

    @Override
    public boolean delete(String bookId) throws Exception {
       return CrudUtil.executeUpdate("DELETE FROM books WHERE BookId = ?", bookId);
}
   

    @Override
    public BookEntity get(String bookId) throws Exception {
      ResultSet rst = CrudUtil.executeQuery("SELECT * FROM books WHERE BookId = ?", bookId);
        if(rst.next()){
          
            BookEntity entity = new BookEntity(rst.getString("BookId"), 
                    rst.getString("Name"),rst.getString("Author"));
            return entity;
        }
        return null;
    }
    
  

    @Override
    public ArrayList<BookEntity> getAll() throws Exception {
         ArrayList<BookEntity> bookEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM books");
        while (rst.next()) {            
            BookEntity entity; 
            entity = new BookEntity(
                    rst.getString("BookId"), 
                    rst.getString("Name"),
                    rst.getString("Author"));
            bookEntities.add(entity);
        }
        return bookEntities;
    }
    
    
    
   
   
    
}
    


