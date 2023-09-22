/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentcar.layerd.service.custom.impl;

import java.util.ArrayList;
import rentcar.layerd.dao.DaoFactory;
import rentcar.layerd.dao.custom.RentDao;
import rentcar.layerd.dao.custom.RentDetailsDao;
import rentcar.layerd.dto.RentDetailsDto;
import rentcar.layerd.dto.RentDto;
import rentcar.layerd.entity.CarEntity;
import rentcar.layerd.entity.RentDetailsEntity;
import rentcar.layerd.entity.RentEntity;
import rentcar.layerd.service.custom.RentDetailsService;


/**
 *
 * @author TOSHIBA
 */
public class RentDetailsServiceImpl implements RentDetailsService {
RentDetailsDao rentDetailsDao= (RentDetailsDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.RENTDETAILS);
    @Override
    public String addRentDetails(RentDetailsDto dto) throws Exception {
        RentDetailsEntity red=new RentDetailsEntity(dto.getId(),dto.getCustID(),dto.getCarID(),dto.getFromDate(),dto.getToDate(),dto.getCustnic());
        
    
        if(rentDetailsDao.add(red)){
            return "";
        }else{
            return "";
        }
    }

    @Override
    public ArrayList<RentDetailsDto> getAllRentDetails() throws Exception {
        ArrayList <RentDetailsDto> carrentDtos=new ArrayList <>();
        ArrayList <RentDetailsEntity> carrentEntitys=rentDetailsDao.getAll();
        
    for(RentDetailsEntity entity:carrentEntitys ){
        RentDetailsDto dto=new RentDetailsDto(entity.getId(),entity.getCustID(),entity.getCarID(),entity.getFromDate(),
       entity.getToDate(),entity.getCustnic());
        carrentDtos.add(dto);
    
    }
    return carrentDtos;
    }
      
    

    @Override
    public RentDto getRentDetails(String rentId) throws Exception {
        return null;
    }

    @Override
    public String updateRentDetails(RentDetailsDto dto) throws Exception {
      RentDetailsEntity red =new RentDetailsEntity (dto.getId(),dto.getCustID(),dto.getCarID(),dto.getFromDate(),dto.getToDate(),dto.getCustnic());
       
        if(rentDetailsDao.update(red) ){
        return "";
    }else{
    return "";
        }  
    }

    @Override
    public String deleteRentDetails(String rentId) throws Exception {
        if(rentDetailsDao.delete(rentId) ){
        return "";
    }else{
    return "";
        }  
    }
    
}
