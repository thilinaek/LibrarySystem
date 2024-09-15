/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.Controller;

import java.util.ArrayList;
import library.Dto.BookDto;
import library.Service.Custom.BookService;
import library.Service.ServiceFactory;

/**
 *
 * @author Nawanjana
 */
public class BookController {
    private final  BookService bookService =(BookService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.BOOK);
    public String save(BookDto bookDto) throws Exception{
      return bookService.save(bookDto);
    }  
     public String update(BookDto bookDto) throws Exception{
      return bookService.update(bookDto);
    }  
      public String delete(String bookId) throws Exception{
      return bookService.delete(bookId);
    }  
       public ArrayList<BookDto> getAll() throws Exception{
      return bookService.getAll();
    }  
     public BookDto get(String bookId) throws Exception{
         return bookService.get(bookId);
     }  
  
}
