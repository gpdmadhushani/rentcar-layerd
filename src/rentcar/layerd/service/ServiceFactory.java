/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentcar.layerd.service;

import rentcar.layerd.service.custom.impl.CategoryServiceImpl;
import rentcar.layerd.service.custom.impl.UserServiceImpl;

/**
 *
 * @author TOSHIBA
 */
public class ServiceFactory {
    
    private static ServiceFactory serviceFactory;
    private ServiceFactory(){}
    
    public static ServiceFactory getInstance(){
        if(serviceFactory==null){
            serviceFactory=new ServiceFactory();
        }
        return serviceFactory;
    }
    
    public SuperService getService(ServiceType type){
        switch(type){
            case USER:
                return new UserServiceImpl();
                
             case CATEGORY:
                return new CategoryServiceImpl();
               
                 
            default:
                return null;
        
    }
        
    }
    public enum ServiceType{
        USER,CATEGORY
    }
}
