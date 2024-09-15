/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package library.Service.Custom;

import java.util.ArrayList;
import library.Dto.CategoryDto;
import library.Service.SuperService;

/**
 *
 * @author Nawanjana
 */
public interface CategoryService extends SuperService {
 String save(CategoryDto categoryDto)throws Exception;
    String update(CategoryDto categoryDto)throws Exception;
    String delete(String name)throws Exception;
    CategoryDto get(String name)throws Exception;
    ArrayList<CategoryDto>getAll() throws Exception;
    
    
}
