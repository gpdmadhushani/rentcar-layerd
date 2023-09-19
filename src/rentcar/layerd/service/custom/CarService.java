/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rentcar.layerd.service.custom;

import java.util.ArrayList;
import rentcar.layerd.dto.CarDto;
import rentcar.layerd.dto.CategoryDto;
import rentcar.layerd.service.SuperService;

/**
 *
 * @author TOSHIBA
 */
public interface CarService extends SuperService {
    String addCar(CarDto carDto) throws Exception;
     String updateCar(CarDto carDto )throws Exception;
     String deleteCar(String id )throws Exception;
    CarDto getCar(String id )throws Exception;
     ArrayList<CarDto> getAllCar()throws Exception;
     
}
