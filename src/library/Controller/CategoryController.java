/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.Controller;

import java.util.ArrayList;
import library.Dto.CategoryDto;
import library.Service.Custom.CategoryService;
import library.Service.ServiceFactory;

/**
 *
 * @author Nawanjana
 */
public class CategoryController {
    private final  CategoryService categoryService =(CategoryService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CATEGORY);

    public String save(CategoryDto categoryDto) throws Exception{
      return categoryService.save(categoryDto);
    }  
     public String update(CategoryDto categoryDto) throws Exception{
      return categoryService.update(categoryDto);
    }  
      public String delete(String bookId) throws Exception{
      return categoryService.delete(bookId);
    }  
       public ArrayList<CategoryDto> getAll() throws Exception{
      return categoryService.getAll();
    }  
     public CategoryDto get(String bookId) throws Exception{
         return categoryService.get(bookId);
     }  
}
