/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentcar.layerd.service.custom.impl;

import java.util.ArrayList;
import rentcar.layerd.dao.DaoFactory;
import rentcar.layerd.dao.custom.CategoryDao;

import rentcar.layerd.dto.CategoryDto;
import rentcar.layerd.entity.CategoryEntity;
import rentcar.layerd.entity.UserEntity;
import rentcar.layerd.service.custom.CategoryService;


/**
 *
 * @author TOSHIBA
 */
public class CategoryServiceImpl implements CategoryService {
CategoryDao categoryDao= (CategoryDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CATEGORY);
    @Override
    public String updateCategory(CategoryDto dto) throws Exception {
         CategoryEntity ce =new CategoryEntity (dto.getCategoryID(),dto.getName());
       
        if(categoryDao.update(ce) ){
        return "Successfully Update";
    }else{
    return "fail";
        }  
        
    }

    @Override
    public String deleteCategory(String id) throws Exception {
         if(categoryDao.delete(id) ){
        return "Successfully Delete";
    }else{
    return "fail";
        }  
    }

    @Override
    public CategoryDto getCategory(String id) throws Exception {
          CategoryEntity entity=categoryDao.get(id);
        CategoryDto cat=new CategoryDto(entity.getCategoryID(), entity.getName());
    if(cat!=null){
        return cat;
    }else{
        return null;
    }
    }

    @Override
    public ArrayList<CategoryDto> getAllCategory() throws Exception {
        ArrayList <CategoryDto> categoryDtos=new ArrayList <>();
        ArrayList <CategoryEntity> categoryEntitys=categoryDao.getAll();
        
    for(CategoryEntity entity:categoryEntitys ){
        CategoryDto dto=new CategoryDto(entity.getCategoryID(), entity.getName());
        categoryDtos.add(dto);
    
    }
    return categoryDtos;
    }
    

    @Override
    public String addCategory(CategoryDto dto) throws Exception {
        CategoryEntity ce=new CategoryEntity(dto.getCategoryID(), dto.getName());
        
        if(categoryDao.add(ce)){
            return "Successfully added";
        }else{
            return "Fail";
        }
    }
    
}
