/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.Dao.Custom.Impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import library.Dao.CrudUtil;
import library.Dao.Custom.BookBorrowingDao;
import library.entity.BookBorrowingEntity;

/**
 *
 * @author Nawanjana
 */
public class BookBorrowingDaoImpl implements BookBorrowingDao{
   
    @Override
    public boolean create(BookBorrowingEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO issue_books VALUES(?,?,?,?)",  t.getBookId(),t.getStudentId(),t.getIssueDate(),t.getReturnDate());
    }

    @Override
    public boolean update(BookBorrowingEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE issue_books SET StudentId=?,IssueDate=?,ReturnDate=?  WHERE BookId = ?",  t.getStudentId(),t.getIssueDate(),t.getReturnDate(),t.getBookId());
    }

    @Override
    public boolean delete(String bookId) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM issue_books WHERE BookId = ?", bookId);
}

    @Override
    public BookBorrowingEntity get(String bookId) throws Exception {
      ResultSet rst = CrudUtil.executeQuery("SELECT * FROM issue_book WHERE BookId = ?", bookId);
        if(rst.next()){
          
            BookBorrowingEntity entity = new BookBorrowingEntity(rst.getString("BookId"), 
                    rst.getString("StudentId"),rst.getDate("IssueDate"),rst.getDate("ReturnDate"));
            return entity;
        }
        return null;
    }

    @Override
    public ArrayList<BookBorrowingEntity> getAll() throws Exception {
        ArrayList<BookBorrowingEntity> bookBorrowingEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM issue_books");
        while (rst.next()) {            
            BookBorrowingEntity entity; 
            entity = new BookBorrowingEntity(
                    rst.getString("BookId"), 
                    rst.getString("StudentId"),
                    rst.getDate("IssueDate"),
                    rst.getDate("ReturnDate"));
            bookBorrowingEntities.add(entity);
        }
        return bookBorrowingEntities;
    }
}

