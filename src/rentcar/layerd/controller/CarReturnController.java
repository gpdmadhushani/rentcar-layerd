/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentcar.layerd.controller;

import rentcar.layerd.dto.CarDto;
import rentcar.layerd.dto.CarReturnDto;
import rentcar.layerd.service.ServiceFactory;
import rentcar.layerd.service.custom.CarReturnService;
import rentcar.layerd.service.custom.CarService;

/**
 *
 * @author TOSHIBA
 */
public class CarReturnController {
    CarReturnService carReturnService=(CarReturnService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CARRETURN);

public String addCarReturn(CarReturnDto carreturnDto) throws Exception {
      return carReturnService.addReturn(carreturnDto); 
    }


}
