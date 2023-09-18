/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentcar.layerd.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import rentcar.layerd.dao.CrudUtil;
import rentcar.layerd.dao.custom.CategoryDao;
import rentcar.layerd.entity.CategoryEntity;


/**
 *
 * @author TOSHIBA
 */
public class CategoryDaoImpl implements CategoryDao {

    @Override
    public boolean add(CategoryEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO category VALUES(?,?)",t.getCategoryID(),t.getName());
    }

    @Override
    public CategoryEntity get(String id) throws Exception {
          ResultSet rst= CrudUtil.executeQuery("Select * from category WHERE categoryID=?", id);
       
        while(rst.next()){
            CategoryEntity categoryEntity=new CategoryEntity(rst.getString(1),
           
           rst.getString(2));
            return categoryEntity;
         
        }
        
        return new CategoryEntity();
    }

    @Override
    public boolean update(CategoryEntity t) throws Exception {
       return CrudUtil.executeUpdate("Update category SET name=? WHERE categoryID=?",t.getName(),t.getCategoryID());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM category WHERE categoryID=?",id);   
    }

    @Override
    public ArrayList<CategoryEntity> getAll() throws Exception {
        ArrayList<CategoryEntity> categoryEntity=new ArrayList<>();
        
        ResultSet rst=CrudUtil.executeQuery("Select * from category");
        
        while(rst.next()){
            CategoryEntity categoryEntitys=new CategoryEntity(rst.getString(1),
           
           rst.getString(2));
           
        categoryEntity.add(categoryEntitys);
        
        
    }

   return categoryEntity;
    
}
    
    
}
