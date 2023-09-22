/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentcar.layerd.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import rentcar.layerd.dao.CrudUtil;
import rentcar.layerd.dao.custom.RentDao;
import rentcar.layerd.entity.CustomerEntity;
import rentcar.layerd.entity.RentEntity;

/**
 *
 * @author TOSHIBA
 */
public class RentDaoImpl implements RentDao {

    @Override
    public boolean add(RentEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO rent VALUES(?,?,?,?,?,?,?,?,?,?)",t.getId(),t.getCustID()
        , t.getFromDate(),t.getToDate(),t.getCarID(),t.getPerdayrent(),t.getAdvance(),t.getRefundDeposit(),
        t.getTotal(),t.getBalance());
    }

    @Override
    public RentEntity get(String id) throws Exception {
        ResultSet rst= CrudUtil.executeQuery("Select * from rent WHERE rentID=?", id);
       
        while(rst.next()){
            RentEntity rentEntity=new RentEntity(rst.getString(1),
           
           rst.getString(2),rst.getDate(3),rst.getDate(4),rst.getString(5),rst.getDouble(6),rst.getDouble(7),
            rst.getDouble(8),rst.getDouble(9),rst.getDouble(10));
            return rentEntity;
         
        }
        
        return new RentEntity(); 
    }

    @Override
    public boolean update(RentEntity t) throws Exception {
         return CrudUtil.executeUpdate("Update rent SET customerID=?,fromDate=?,toDate=?,carID=?,perdayrent=?,advancePayment=?,refundDeposit=?,total=?,balance=? WHERE rentID=?",t.getCustID()
        , t.getFromDate(),t.getToDate(),t.getCarID(),t.getPerdayrent(),t.getAdvance(),t.getRefundDeposit(),
       t.getTotal(),t.getBalance(),t.getId());
    }

    @Override
    public boolean delete(String id) throws Exception {
       return CrudUtil.executeUpdate("DELETE FROM rent WHERE rentID=?",id);
    }

    @Override
    public ArrayList<RentEntity> getAll() throws Exception {
        ArrayList<RentEntity> rentEntity=new ArrayList<>();
        
        ResultSet rst=CrudUtil.executeQuery("Select * from rent");
        
        while(rst.next()){
            RentEntity rentEntitys=new RentEntity(rst.getString(1),
           
           rst.getString(2),rst.getDate(3),rst.getDate(4),rst.getString(5),rst.getDouble(6),rst.getDouble(7),
            rst.getDouble(8),rst.getDouble(9),rst.getDouble(10));
           
        rentEntity.add(rentEntitys);
        
        
    }

   return rentEntity;
    }
    
}
