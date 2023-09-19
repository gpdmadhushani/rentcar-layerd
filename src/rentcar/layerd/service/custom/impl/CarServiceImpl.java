/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentcar.layerd.service.custom.impl;

import java.util.ArrayList;
import rentcar.layerd.dao.DaoFactory;
import rentcar.layerd.dao.custom.CarDao;
import rentcar.layerd.dao.custom.CategoryDao;
import rentcar.layerd.dto.CarDto;
import rentcar.layerd.dto.CategoryDto;
import rentcar.layerd.entity.CarEntity;
import rentcar.layerd.entity.CategoryEntity;

import rentcar.layerd.service.custom.CarService;

/**
 *
 * @author TOSHIBA
 */
public class CarServiceImpl implements CarService {
    CarDao carDao= (CarDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CAR);

    @Override
    public String addCar(CarDto dto) throws Exception {
       CarEntity ce=new CarEntity(dto.getId(), dto.getCategory(),dto.getBrand(),dto.getModel(),
       dto.getTransmission(),dto.getFualType(),dto.getVehicleNo(),dto.getYear(),dto.getPerDayPrice());
        
        if(carDao.add(ce)){
            return "Successfully added";
        }else{
            return "Fail";
        }
    
    }

    @Override
    public String updateCar(CarDto dto) throws Exception {
        CarEntity ce =new CarEntity (dto.getId(), dto.getCategory(),dto.getBrand(),dto.getModel(),
       dto.getTransmission(),dto.getFualType(),dto.getVehicleNo(),dto.getYear(),dto.getPerDayPrice());
       
        if(carDao.update(ce) ){
        return "Successfully Update";
    }else{
    return "fail";
        }  
        
    }

    @Override
    public String deleteCar(String id) throws Exception {
        if(carDao.delete(id) ){
        return "Successfully Delete";
    }else{
    return "fail";
        }  
    }

    @Override
    public CarDto getCar(String id) throws Exception {
        CarEntity entity=carDao.get(id);
        CarDto car=new CarDto(entity.getId(), entity.getCategory(),entity.getBrand(),entity.getModel(),
       entity.getTransmission(),entity.getFualType(),entity.getVehicleNo(),entity.getYear(),entity.getPerDayPrice());
    if(car!=null){
        return car;
    }else{
        return null;
    }
    }

    @Override
    public ArrayList<CarDto> getAllCar() throws Exception {
        ArrayList <CarDto> carDtos=new ArrayList <>();
        ArrayList <CarEntity> carEntitys=carDao.getAll();
        
    for(CarEntity entity:carEntitys ){
        CarDto dto=new CarDto(entity.getId(), entity.getCategory(),entity.getBrand(),entity.getModel(),
       entity.getTransmission(),entity.getFualType(),entity.getVehicleNo(),entity.getYear(),entity.getPerDayPrice());
        carDtos.add(dto);
    
    }
    return carDtos;
    }
    
}
