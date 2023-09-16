/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentcar.layerd.controller;

import java.sql.ResultSet;
import rentcar.layerd.dao.CrudUtil;
import rentcar.layerd.dto.UserDto;
import rentcar.layerd.entity.UserEntity;
import rentcar.layerd.service.ServiceFactory;
import rentcar.layerd.service.custom.UserService;
import rentcar.layerd.service.custom.impl.UserServiceImpl;

/**
 *
 * @author TOSHIBA
 */
public class UserController {

    

   
UserService userService=(UserService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.USER);
    public String addUser(UserDto userDto) throws Exception {
       return  userService.addUser(userDto);
        
    }
    
    
      public  UserDto getUser(String userName)throws Exception {
      return userService.getUser(userName); 
    }
    
      
      
      
}
