/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentcar.layerd.service.custom.impl;

import java.util.ArrayList;
import rentcar.layerd.dao.DaoFactory;
import rentcar.layerd.dao.custom.CarDao;
import rentcar.layerd.dao.custom.CustomerDao;
import rentcar.layerd.dto.CustomerDto;
import rentcar.layerd.entity.CustomerEntity;
import rentcar.layerd.service.custom.CustomerService;

/**
 *
 * @author TOSHIBA
 */
public class CustomerServiceImpl implements CustomerService {
CustomerDao customerDao= (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);
    @Override
    public String addCustomer(CustomerDto dto) throws Exception {
        CustomerEntity ce=new CustomerEntity(dto.getId(), dto.getName(),dto.getTitle(),dto.getNic(),
       dto.getGender(),dto.getAddress(),dto.getContact());
        
        if(customerDao.add(ce)){
            return "Successfully added";
        }else{
            return "Fail";
        }
    }

    @Override
    public String updateCustomer(CustomerDto dto) throws Exception {
        CustomerEntity ce =new CustomerEntity (dto.getId(), dto.getName(),dto.getTitle(),dto.getNic(),
       dto.getGender(),dto.getAddress(),dto.getContact());
       
        if(customerDao.update(ce) ){
        return "Successfully Update";
    }else{
    return "fail";
        }  
    }

    @Override
    public String deleteCustomer(String id) throws Exception {
          if(customerDao.delete(id) ){
        return "Successfully Delete";
    }else{
    return "fail";
        }  
    }

    @Override
    public CustomerDto getCustomer(String id) throws Exception {
         CustomerEntity entity=customerDao.get(id);
        CustomerDto cus=new CustomerDto(entity.getId(), entity.getName(),entity.getTitle(),entity.getNic(),
       entity.getGender(),entity.getAddress(),entity.getContact());
    if(cus!=null){
        return cus;
    }else{
        return null;
    }
    }

    @Override
    public ArrayList<CustomerDto> getAllCustomer() throws Exception {
         ArrayList <CustomerDto> customerDtos=new ArrayList <>();
        ArrayList <CustomerEntity> customerEntitys=customerDao.getAll();
        
    for(CustomerEntity entity:customerEntitys ){
        CustomerDto dto=new CustomerDto(entity.getId(), entity.getName(),entity.getTitle(),entity.getNic(),
       entity.getGender(),entity.getAddress(),entity.getContact());
        customerDtos.add(dto);
    
    }
    return customerDtos;
    }
    }
    

