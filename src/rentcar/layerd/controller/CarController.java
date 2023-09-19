/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentcar.layerd.controller;

import java.util.ArrayList;
import rentcar.layerd.dto.CarDto;
import rentcar.layerd.dto.CategoryDto;
import rentcar.layerd.service.ServiceFactory;
import rentcar.layerd.service.custom.CarService;

/**
 *
 * @author TOSHIBA
 */
public class CarController {
    CarService carService=(CarService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CAR);

public String addCar(CarDto carDto) throws Exception {
      return carService.addCar(carDto); 
    }

    public ArrayList<CarDto> getAllCar () throws Exception {
        return carService.getAllCar();
    }

    public CarDto getCar(String carId) throws Exception {
      return carService.getCar(carId);
    }

    public String updateCar(CarDto carDto) throws Exception {
        return carService.updateCar(carDto);
    }

    public String deleteCar(String carId) throws Exception {
       return carService.deleteCar(carId);
    }
    




}
