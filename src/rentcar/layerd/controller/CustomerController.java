/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentcar.layerd.controller;

import java.util.ArrayList;
import rentcar.layerd.dto.CarDto;
import rentcar.layerd.dto.CustomerDto;
import rentcar.layerd.service.ServiceFactory;
import rentcar.layerd.service.custom.CarService;
import rentcar.layerd.service.custom.CustomerService;

/**
 *
 * @author TOSHIBA
 */
public class CustomerController {
    CustomerService customerService=(CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);

public String addCustomer(CustomerDto customerDto) throws Exception {
      return customerService.addCustomer(customerDto); 
    }

    public ArrayList<CustomerDto> getAllCustomer () throws Exception {
        return customerService.getAllCustomer();
    }

    public CustomerDto getCustomer(String customerId) throws Exception {
      return customerService.getCustomer(customerId);
    }

    public String updateCustomer(CustomerDto customerDto) throws Exception {
        return customerService.updateCustomer(customerDto);
    }

    public String deleteCustomer(String customerId) throws Exception {
       return customerService.deleteCustomer(customerId);
    }

}
