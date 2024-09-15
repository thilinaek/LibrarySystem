/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.Service.Custom.Impl;

import java.util.ArrayList;
import library.Dao.Custom.BookDao;
import library.Dao.DaoFactory;
import library.Dto.BookDto;
import library.Service.Custom.BookService;
import library.entity.BookEntity;

/**
 *
 * @author Nawanjana
 */
public class BookServiceImpl implements BookService{
    private final BookDao bookDao=(BookDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BOOK);
    @Override
    public String save(BookDto bookDto) throws Exception {
      BookEntity entity = getBookEntity(bookDto);
         
        return bookDao.create(entity) ? "Success" : "Fail";
     
    }
    @Override
    public String update(BookDto bookDto) throws Exception {
       BookEntity entity = getBookEntity(bookDto);
         
        return bookDao.update(entity) ? "Success" : "Fail";
    }

    @Override
    public String delete(String name) throws Exception {
         return bookDao.delete(name) ?  "Success" : "Fail";
    }

    @Override
    public BookDto get(String name) throws Exception {
       BookEntity entity = bookDao.get(name);
        if(entity != null){
            return getBookDto(entity);
        }
        return null;
    }

    @Override
    public ArrayList<BookDto> getAll() throws Exception {
         ArrayList<BookEntity> bookEntitys = bookDao.getAll();
        if(bookEntitys != null && !bookEntitys.isEmpty()){
            ArrayList<BookDto> bookDtos = new ArrayList<>();
            
            for (BookEntity bookEntity: bookEntitys) {
                bookDtos.add(getBookDto(bookEntity));
            }
            
            return bookDtos;
        }
        return null;
    }
    
    private BookEntity getBookEntity(BookDto bookDto){
       return new BookEntity(
               bookDto.getBookId(),
               bookDto.getName(),
               bookDto.getAuthor());
}
     private BookDto getBookDto(BookEntity entity){
       return new BookDto(
               entity.getBookId(),
               entity.getName(),
               entity.getAuthor());
                 
                
     }

  
}
