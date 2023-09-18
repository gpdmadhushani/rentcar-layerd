/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rentcar.layerd.service.custom;

import java.util.ArrayList;
import rentcar.layerd.dto.CategoryDto;
import rentcar.layerd.dto.UserDto;
import rentcar.layerd.service.SuperService;

/**
 *
 * @author TOSHIBA
 */
public interface CategoryService extends SuperService {
    String updateCategory(CategoryDto categoryDto )throws Exception;
     String deleteCategory(String id )throws Exception;
    CategoryDto getCategory(String id )throws Exception;
     ArrayList<CategoryDto> getAllCategory()throws Exception;
    public String addCategory(CategoryDto categoryDto) throws Exception;

}
