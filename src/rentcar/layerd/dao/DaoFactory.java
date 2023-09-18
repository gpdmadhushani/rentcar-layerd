/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentcar.layerd.dao;

import rentcar.layerd.dao.custom.impl.CategoryDaoImpl;
import rentcar.layerd.dao.custom.impl.UserDaoImpl;
import rentcar.layerd.service.ServiceFactory;

import rentcar.layerd.service.SuperService;
import rentcar.layerd.service.custom.impl.UserServiceImpl;

/**
 *
 * @author TOSHIBA
 */
public class DaoFactory {
    private static DaoFactory daoFactory;
    private DaoFactory(){
    
}
    
  public static DaoFactory getInstance(){
        if(daoFactory==null){
            daoFactory=new DaoFactory();
        }
        return daoFactory;
    }  
    
    
 public enum DaoTypes{
        USER,CATEGORY
    } 
 
 
 public SuperDao getDao(DaoTypes type){
        switch(type){
            case USER:
                return new UserDaoImpl();
                
                case CATEGORY:
                return new CategoryDaoImpl();
            default:
                return null;
        
    }
        
    }
 
 
 
 
 
}

