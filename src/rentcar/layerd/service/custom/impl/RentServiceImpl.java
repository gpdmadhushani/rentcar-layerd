/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentcar.layerd.service.custom.impl;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import rentcar.layerd.dao.DaoFactory;
import rentcar.layerd.dao.custom.CustomerDao;
import rentcar.layerd.dao.custom.RentDao;
import rentcar.layerd.dto.RentDto;
import rentcar.layerd.entity.RentEntity;
import rentcar.layerd.service.custom.RentService;

/**
 *
 * @author TOSHIBA
 */
public class RentServiceImpl  implements RentService{
RentDao rentDao= (RentDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.RENT);
    @Override
    public String addRent(RentDto dto) throws Exception {
        RentEntity re=new RentEntity(dto.getId(),dto.getCustID(),dto.getFromDate(),dto.getToDate(),dto.getCarID(),
        dto.getPerdayrent(),dto.getAdvance(),dto.getRefundDeposit(),dto.getTotal(),dto.getBalance());
        
    
        if(rentDao.add(re)){
            return "Successfully added";
        }else{
            return "Fail";
        }
    
    }

    @Override
    public ArrayList<RentDto> getAllRent() throws Exception {
    
        ArrayList <RentDto> rentDtos=new ArrayList <>();
        ArrayList <RentEntity> rentEntitys=rentDao.getAll();
        
        for(RentEntity entity:rentEntitys ){
            RentDto dto=new RentDto(entity.getId(),entity.getCustID(),entity.getFromDate(),entity.getToDate(),entity.getCarID(),
                    entity.getPerdayrent(),entity.getAdvance(),entity.getRefundDeposit(),entity.getTotal(),entity.getBalance());
            rentDtos.add(dto);
            
        }
        return rentDtos;
    
    }

    @Override
    public RentDto getRent(String rentId) throws Exception {
         RentEntity entity=rentDao.get(rentId);
        RentDto ren=new RentDto(entity.getId(),entity.getCustID(),entity.getFromDate(),entity.getToDate(),entity.getCarID(),
                    entity.getPerdayrent(),entity.getAdvance(),entity.getRefundDeposit(),entity.getTotal(),entity.getBalance());
    if(ren!=null){
        return ren;
    }else{
        return null;
    }
    }

    @Override
    public String updateRent(RentDto dto) throws Exception {
          RentEntity re =new RentEntity (dto.getId(),dto.getCustID(),dto.getFromDate(),dto.getToDate(),dto.getCarID(),
        dto.getPerdayrent(),dto.getAdvance(),dto.getRefundDeposit(),dto.getTotal(),dto.getBalance());
       
        if(rentDao.update(re) ){
        return "Successfully Update";
    }else{
    return "fail";
        }  
    }

    @Override
    public String deleteRent(String rentId) throws Exception {
         if(rentDao.delete(rentId) ){
        return "Successfully Delete";
    }else{
    return "fail";
        }  
    }




    
    
    
}
