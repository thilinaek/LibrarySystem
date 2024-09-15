/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.Controller;

import java.util.ArrayList;
import library.Dto.BookBorrowingDto;
import library.Service.Custom.BookBorrowingService;
import library.Service.ServiceFactory;

/**
 *
 * @author Nawanjana
 */
public class BookBorrowingController {
     private final  BookBorrowingService bookBorrowingService =(BookBorrowingService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.BOOKBORROWING);
    public String save(BookBorrowingDto bookBorrowingDto) throws Exception{
      return bookBorrowingService.save(bookBorrowingDto);
    }  
     public String update(BookBorrowingDto bookBorrowingDto) throws Exception{
      return bookBorrowingService.update(bookBorrowingDto);
    }  
      public String delete(String bookId) throws Exception{
      return bookBorrowingService.delete(bookId);
    }  
       public ArrayList<BookBorrowingDto> getAll() throws Exception{
      return bookBorrowingService.getAll();
    }  
     public BookBorrowingDto get(String bookId) throws Exception{
         return bookBorrowingService.get(bookId);
     }  
  
}

