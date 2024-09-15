/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.Service.Custom.Impl;

import java.util.ArrayList;
import library.Dao.Custom.BookBorrowingDao;
import library.Dao.DaoFactory;
import library.Dto.BookBorrowingDto;
import library.Service.Custom.BookBorrowingService;
import library.entity.BookBorrowingEntity;

/**
 *
 * @author Nawanjana
 */
public class BookBorrowingServiceImpl implements BookBorrowingService{
   private final BookBorrowingDao bookBorrowingDao=(BookBorrowingDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BOOKBORROWING);

    @Override
    public String save(BookBorrowingDto bookBorrowingDto) throws Exception {
      BookBorrowingEntity entity = getBookBorrowingEntity(bookBorrowingDto);
         
        return bookBorrowingDao.create(entity) ? "Success" : "Fail";
    }
    
    @Override
    public String update(BookBorrowingDto bookBorrowingDto) throws Exception {
     BookBorrowingEntity entity = getBookBorrowingEntity(bookBorrowingDto);
         
        return bookBorrowingDao.update(entity) ? "Success" : "Fail";
    }

    @Override
    public String delete(String studentId) throws Exception {
        return bookBorrowingDao.delete(studentId) ?  "Success" : "Fail";
    }

    @Override
    public BookBorrowingDto get(String studentId) throws Exception {
        BookBorrowingEntity entity = bookBorrowingDao.get(studentId);
        if(entity != null){
            return getBookBorrowingDto(entity);
        }
        return null;
    }

    @Override
    public ArrayList<BookBorrowingDto> getAll() throws Exception {
     ArrayList<BookBorrowingEntity> bookBorrowingEntitys = bookBorrowingDao.getAll();
        if(bookBorrowingEntitys != null && !bookBorrowingEntitys.isEmpty()){
            ArrayList<BookBorrowingDto> bookBorrowingDtos = new ArrayList<>();
            
            for (BookBorrowingEntity bookBorrowingEntity: bookBorrowingEntitys) {
                bookBorrowingDtos.add(getBookBorrowingDto(bookBorrowingEntity));
            }
            
            return bookBorrowingDtos;
        }
        return null;
    }
     private BookBorrowingEntity getBookBorrowingEntity(BookBorrowingDto bookBorrowingDto){
       return new BookBorrowingEntity(
               bookBorrowingDto.getBookId(),
               bookBorrowingDto.getStudentId(),
               bookBorrowingDto.getIssueDate(),
               bookBorrowingDto.getReturnDate());
}
     private BookBorrowingDto getBookBorrowingDto(BookBorrowingEntity entity){
       return new BookBorrowingDto(
               entity.getBookId(),
               entity.getStudentId(),
                entity.getIssueDate(),
               entity.getReturnDate());
                 
                
     }
}

