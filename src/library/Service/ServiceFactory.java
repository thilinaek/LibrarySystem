/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.Service;

import library.Service.Custom.Impl.BookBorrowingServiceImpl;
import library.Service.Custom.Impl.BookServiceImpl;
import library.Service.Custom.Impl.CategoryServiceImpl;
import library.Service.Custom.Impl.StudentServiceImpl;

/**
 *
 * @author Nawanjana
 */
public class ServiceFactory {
   private static ServiceFactory serviceFactory;
    private ServiceFactory(){}
    public static ServiceFactory getInstance(){
        if(serviceFactory ==null){
            serviceFactory = new ServiceFactory();
        }
        return  serviceFactory;
    }
       public SuperService getService(ServiceType serviceType)  {
           switch(serviceType){
               case CATEGORY:
                   return (SuperService) new CategoryServiceImpl();
              case STUDENT:
                  return new StudentServiceImpl(); 
              case BOOK:
                   return new BookServiceImpl();   
               case BOOKBORROWING:
                  return new BookBorrowingServiceImpl() {};      
                default:
                    return null;
           }
           }


         public enum ServiceType{
    
                CATEGORY,STUDENT,BOOK,BOOKBORROWING;
    }
}
