/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentcar.layerd.controller;

import java.util.ArrayList;
import rentcar.layerd.dto.CustomerDto;
import rentcar.layerd.dto.RentDto;
import rentcar.layerd.service.ServiceFactory;

import rentcar.layerd.service.custom.RentService;

/**
 *
 * @author TOSHIBA
 */
public class RentController {
    
    RentService rentService=(RentService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.RENT);

public String addRent(RentDto rentDto) throws Exception {
      return rentService.addRent(rentDto); 
    }

    public ArrayList<RentDto> getAllRent () throws Exception {
        return rentService.getAllRent();
    }

    public RentDto getRent(String rentId) throws Exception {
      return rentService.getRent(rentId);
    }

    public String updateRent(RentDto rentDto) throws Exception {
        return rentService.updateRent(rentDto);
    }

    public String deleteRent(String rentId) throws Exception {
       return rentService.deleteRent(rentId);
    }
}
