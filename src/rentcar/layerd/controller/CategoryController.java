/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentcar.layerd.controller;

import java.util.ArrayList;
import rentcar.layerd.dto.CategoryDto;
import rentcar.layerd.service.ServiceFactory;
import rentcar.layerd.service.custom.CategoryService;
import rentcar.layerd.service.custom.CustomerService;

/**
 *
 * @author TOSHIBA
 */
public class CategoryController {
    
    CategoryService categoryService=(CategoryService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CATEGORY);

    public String addCategory(CategoryDto categoryDto) throws Exception {
      return categoryService.addCategory(categoryDto); 
    }

    public ArrayList<CategoryDto> getAllCategory () throws Exception {
        return categoryService.getAllCategory();
    }

    public CategoryDto getCategory(String catId) throws Exception {
      return categoryService.getCategory(catId);
    }

    public String updateCategory(CategoryDto categoryDto) throws Exception {
        return categoryService.updateCategory(categoryDto);
    }

    public String deleteCategory(String catId) throws Exception {
       return categoryService.deleteCategory(catId);
    }
    
    
}
