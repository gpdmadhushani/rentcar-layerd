/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentcar.layerd.controller;

import java.util.ArrayList;
import rentcar.layerd.dto.RentDetailsDto;
import rentcar.layerd.dto.RentDto;
import rentcar.layerd.service.ServiceFactory;
import rentcar.layerd.service.custom.RentDetailsService;
import rentcar.layerd.service.custom.RentService;

/**
 *
 * @author TOSHIBA
 */
public class RentDetailsController {
 RentDetailsService rentDetailsService=(RentDetailsService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.RENTDETAILS);
   
 public String addRentDetails(RentDetailsDto rentDetailsDto) throws Exception {
      return rentDetailsService.addRentDetails(rentDetailsDto); 
    }

    public ArrayList<RentDetailsDto> getAllRentDetails () throws Exception {
         return rentDetailsService.getAllRentDetails();
    }

    public RentDto getRent(String rentId) throws Exception {
      return null;
    }

    public String updateRentDetails(RentDetailsDto rentDetailsDto) throws Exception {
        return rentDetailsService.updateRentDetails(rentDetailsDto);
    }

    public String deleteRentDetails(String rentId) throws Exception {
       return rentDetailsService.deleteRentDetails(rentId);
    }
 
 
 
 
}
