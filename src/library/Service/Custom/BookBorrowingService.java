/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package library.Service.Custom;

import java.util.ArrayList;
import library.Dto.BookBorrowingDto;
import library.Service.SuperService;

/**
 *
 * @author Nawanjana
 */
public interface BookBorrowingService extends SuperService{
 String save(BookBorrowingDto bookBorrowingDto)throws Exception;
    String update(BookBorrowingDto bookBorrowingDto)throws Exception;
    String delete(String name)throws Exception;
    BookBorrowingDto get(String name)throws Exception;
    ArrayList<BookBorrowingDto>getAll() throws Exception;   
}
