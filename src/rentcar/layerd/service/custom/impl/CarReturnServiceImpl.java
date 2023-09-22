/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentcar.layerd.service.custom.impl;

import rentcar.layerd.dao.DaoFactory;
import rentcar.layerd.dao.custom.CarDao;
import rentcar.layerd.dao.custom.CarReturnDao;
import rentcar.layerd.dto.CarReturnDto;
import rentcar.layerd.entity.CarEntity;
import rentcar.layerd.entity.CarReturnEntity;
import rentcar.layerd.service.custom.CarReturnService;

/**
 *
 * @author TOSHIBA
 */
public class CarReturnServiceImpl implements CarReturnService {
 CarReturnDao carDao= (CarReturnDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CARRETURN);
    @Override
    public String addReturn(CarReturnDto dto) throws Exception {
        CarReturnEntity ce=new CarReturnEntity(dto.getId(), dto.getCustid(),dto.getCarid(),dto.getReturndate());
        
        if(carDao.add(ce)){
            return "Successfully added";
        }else{
            return "Fail";
        }
    }
    
}
