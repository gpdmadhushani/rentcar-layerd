/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentcar.layerd.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import rentcar.layerd.dao.CrudUtil;
import rentcar.layerd.dao.custom.UserDao;
import rentcar.layerd.entity.CustomerEntity;
import rentcar.layerd.entity.UserEntity;

/**
 *
 * @author TOSHIBA
 */
public class UserDaoImpl implements UserDao {

   

    @Override
    public boolean add(UserEntity t) throws Exception {
      return  CrudUtil.executeUpdate("INSERT INTO user VALUES(?,?,?,?,?,?,?,?,?)", t.getId(),t.getTitle(),
        t.getFirstname(),t.getLastname(),t.getEmail(),t.getMobile(),t.getGender()
        ,t.getUsername(),t.getPassword());
    
    
}

    
    public UserEntity get(String userName)throws Exception {
          ResultSet rst= CrudUtil.executeQuery("Select * from user WHERE username=?", userName);
       
        while(rst.next()){
            UserEntity userEntity=new UserEntity(rst.getString(1),
           
           rst.getString(2),
           rst.getString(3),
           rst.getString(4),
           rst.getString(5),
              rst.getString(6),
                   rst.getString(7),
                   rst.getString(8),
                   rst.getString(9));
            return userEntity;
         
        }
        
        return new UserEntity();
    }

    @Override
    public boolean update(UserEntity t) throws Exception {
       return false;
    }

    @Override
    public boolean delete(String id) throws Exception {
        return false;
    }

    @Override
    public ArrayList<UserEntity> getAll() throws Exception {
        return null;
    }

    
   
}