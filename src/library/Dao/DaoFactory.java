/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.Dao;

import library.Dao.Custom.Impl.BookBorrowingDaoImpl;
import library.Dao.Custom.Impl.BookDaoImpl;
import library.Dao.Custom.Impl.CategoryDaoImpl;
import library.Dao.Custom.Impl.StudentDaoImpl;

/**
 *
 * @author Nawanjana
 */
public class DaoFactory {
  public static DaoFactory daoFactory;
    private DaoFactory(){}
    public static DaoFactory getInstance(){
        if(daoFactory==null){
            daoFactory=new DaoFactory();
            
        }return daoFactory;
    }
        public SuperDao getDao(DaoTypes daoTypes){
        return switch (daoTypes) {
            case CATEGORY -> new CategoryDaoImpl(){};
           case STUDENT -> new StudentDaoImpl(){};
           case BOOK -> new BookDaoImpl(){};
         case BOOKBORROWING -> new BookBorrowingDaoImpl(){};
            default -> null;
        };
        
       
    }
    public enum DaoTypes{
        CATEGORY,STUDENT,BOOK,BOOKBORROWING
    }
}

