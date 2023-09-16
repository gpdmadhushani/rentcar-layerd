/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentcar.layerd.service.custom.impl;

import java.util.logging.Level;
import java.util.logging.Logger;
import rentcar.layerd.dao.DaoFactory;
import rentcar.layerd.dao.custom.UserDao;
import rentcar.layerd.dto.CustomerDto;
import rentcar.layerd.dto.UserDto;
import rentcar.layerd.entity.UserEntity;
import rentcar.layerd.service.custom.UserService;

/**
 *
 * @author TOSHIBA
 */
public class UserServiceImpl implements UserService {

    UserDao userDao=(UserDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.USER);
    @Override
    public String addUser(UserDto dto) throws Exception {
        UserEntity ue=new UserEntity(dto.getId(), dto.getTitle(), dto.getFirstname(), 
                dto.getLastname(), dto.getEmail(), dto.getMobile(), dto.getGender(), dto.getUsername(), dto.getPassword());
        
        if(userDao.add(ue)){
            return "Successfully added";
        }else{
            return "Fail";
        }
        
        
        
    }

    @Override
    public UserDto getUser(String userName)  {
        try {
            UserEntity entity=userDao.get(userName);
            UserDto user=new UserDto(entity.getId(), entity.getTitle(), entity.getFirstname(), entity.getLastname(), entity.getEmail(), entity.getMobile(), entity.getGender(), entity.getUsername(), entity.getPassword());
            if(user!=null){
                return user;
            }else{
                return null;
                
                
            }
        } catch (Exception ex) {
            Logger.getLogger(UserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }



    
}
