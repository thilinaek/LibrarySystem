/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package library.Service.Custom;

import java.util.ArrayList;
import library.Dto.BookDto;
import library.Service.SuperService;

/**
 *
 * @author Nawanjana
 */
public interface BookService extends SuperService{
     String save(BookDto bookDto)throws Exception;
    String update(BookDto bookDto)throws Exception;
    String delete(String name)throws Exception;
    BookDto get(String name)throws Exception;
    ArrayList<BookDto>getAll() throws Exception;
    
  
 
    
}
