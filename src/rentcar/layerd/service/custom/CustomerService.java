/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rentcar.layerd.service.custom;

import java.util.ArrayList;

import rentcar.layerd.dto.CustomerDto;
import rentcar.layerd.service.SuperService;

/**
 *
 * @author TOSHIBA
 */
public interface CustomerService extends SuperService {
   String addCustomer(CustomerDto customerDto) throws Exception;
     String updateCustomer(CustomerDto customerDto )throws Exception;
     String deleteCustomer(String id )throws Exception;
    CustomerDto getCustomer(String id )throws Exception;
     ArrayList<CustomerDto> getAllCustomer()throws Exception; 
}
