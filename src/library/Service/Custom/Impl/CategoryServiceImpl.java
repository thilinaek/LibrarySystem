/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.Service.Custom.Impl;

import java.util.ArrayList;
import library.Dao.Custom.CategoryDao;
import library.Dao.DaoFactory;
import library.Dto.CategoryDto;
import library.Service.Custom.CategoryService;
import library.entity.CategoryEntity;

/**
 *
 * @author Nawanjana
 */
public class CategoryServiceImpl implements CategoryService {
 private final CategoryDao categoryDao=(CategoryDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CATEGORY);
    @Override
    public String save(CategoryDto categoryDto) throws Exception {
         CategoryEntity entity = getCategoryEntity(categoryDto);
         
        return categoryDao.create(entity) ? "Success" : "Fail";
     
    }

    @Override
    public String update(CategoryDto categoryDto) throws Exception {
      CategoryEntity entity = getCategoryEntity(categoryDto);
         
        return categoryDao.update(entity) ? "Success" : "Fail";
    }

    @Override
    public String delete(String name) throws Exception {
       return categoryDao.delete(name) ?  "Success" : "Fail";
    }

    @Override
    public CategoryDto get(String name) throws Exception {
      CategoryEntity entity = categoryDao.get(name);
        if(entity != null){
            return getCategoryDto(entity);
        }
        return null;
    }

    @Override
    public ArrayList<CategoryDto> getAll() throws Exception {
        ArrayList<CategoryEntity> categoryEntitys = categoryDao.getAll();
        if(categoryEntitys != null && !categoryEntitys.isEmpty()){
            ArrayList<CategoryDto> categoryDtos = new ArrayList<>();
            
            for (CategoryEntity categoryEntity: categoryEntitys) {
                categoryDtos.add(getCategoryDto(categoryEntity));
            }
            
            return categoryDtos;
        }
        return null;
    }
    
    private CategoryEntity getCategoryEntity(CategoryDto categoryDto){
       return new CategoryEntity(
               categoryDto.getBookId(),
               categoryDto.getName(),
               categoryDto.getAuthor(),
               categoryDto.getCategoryName());
}
    private CategoryDto getCategoryDto(CategoryEntity entity){
       return new CategoryDto(
               entity.getBookId(),
               entity.getName(),
               entity.getAuthor(), 
               entity.getCategoryName());
                 
                }
}
