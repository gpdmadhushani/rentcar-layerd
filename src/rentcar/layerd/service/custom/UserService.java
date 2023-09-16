/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rentcar.layerd.service.custom;

import rentcar.layerd.dto.UserDto;
import rentcar.layerd.service.SuperService;

/**
 *
 * @author TOSHIBA
 */
public interface UserService extends SuperService {

    public String addUser(UserDto userDto) throws Exception;

    public UserDto getUser(String userName);
    
    

   
    
}
