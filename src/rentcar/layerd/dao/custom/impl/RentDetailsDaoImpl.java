/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentcar.layerd.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import rentcar.layerd.dao.CrudUtil;

import rentcar.layerd.dao.custom.RentDetailsDao;
import rentcar.layerd.entity.CarEntity;
import rentcar.layerd.entity.RentDetailsEntity;


/**
 *
 * @author TOSHIBA
 */
public class RentDetailsDaoImpl implements RentDetailsDao {

    @Override
    public boolean delete(String id) throws Exception {
         return CrudUtil.executeUpdate("DELETE FROM allrentdetails WHERE rentID=?",id);
    }

   

    @Override
    public boolean add(RentDetailsEntity t) throws Exception {
         return CrudUtil.executeUpdate("INSERT INTO allrentdetails VALUES(?,?,?,?,?,?)",t.getId(),t.getCustID()
        , t.getCarID(),t.getFromDate(),t.getToDate(),t.getCustnic());
    }

    @Override
    public boolean update(RentDetailsEntity t) throws Exception {
         return CrudUtil.executeUpdate("Update allrentdetails SET customerID=?,carID=?,fromDate=?,toDate=?,customerNIC=? WHERE rentID=?",t.getCustID(),
       t.getCarID(),t.getFromDate(),t.getToDate(),t.getCustnic(),t.getId());
    }

    @Override
    public RentDetailsEntity get(String id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<RentDetailsEntity> getAll() throws Exception {
         ArrayList<RentDetailsEntity> rentDetailsEntity=new ArrayList<>();
        
        ResultSet rst=CrudUtil.executeQuery("Select * from allrentdetails");
        
        while(rst.next()){
            RentDetailsEntity rentDetailsEntitys=new RentDetailsEntity(rst.getString(1),
           
           rst.getString(2),rst.getString(3),rst.getDate(4),rst.getDate(5),rst.getString(6));
           
        rentDetailsEntity.add(rentDetailsEntitys);
        
        
    }

   return rentDetailsEntity;
    
    }
    
    
    
}
