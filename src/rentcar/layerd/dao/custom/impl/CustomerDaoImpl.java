/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentcar.layerd.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import rentcar.layerd.dao.CrudUtil;
import rentcar.layerd.dao.custom.CustomerDao;

import rentcar.layerd.entity.CustomerEntity;

/**
 *
 * @author TOSHIBA
 */
public class CustomerDaoImpl implements CustomerDao {

    @Override
    public boolean add(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO customer VALUES(?,?,?,?,?,?,?)",t.getId(),t.getName()
        , t.getTitle(),t.getNic(),t.getGender(),t.getAddress(),t.getContact());
    }

    @Override
    public CustomerEntity get(String id) throws Exception {
       ResultSet rst= CrudUtil.executeQuery("Select * from customer WHERE custID=?", id);
       
        while(rst.next()){
            CustomerEntity customerEntity=new CustomerEntity(rst.getString(1),
           
           rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7));
            return customerEntity;
         
        }
        
        return new CustomerEntity(); 
    }

    @Override
    public boolean update(CustomerEntity t) throws Exception {
         return CrudUtil.executeUpdate("Update customer SET name=?,title=?,nic=?,gender=?,address=?,contact=? WHERE custID=?",t.getName(),
               t.getTitle(),t.getNic(),t.getGender(),t.getAddress(),t.getContact(),t.getId());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM customer WHERE custID=?",id);
    }

    @Override
    public ArrayList<CustomerEntity> getAll() throws Exception {
          ArrayList<CustomerEntity> customerEntity=new ArrayList<>();
        
        ResultSet rst=CrudUtil.executeQuery("Select * from customer");
        
        while(rst.next()){
            CustomerEntity customerEntitys=new CustomerEntity(rst.getString(1),
           
           rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7));
           
        customerEntity.add(customerEntitys);
        
        
    }

   return customerEntity;
    
    }
    
    
}
