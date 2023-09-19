/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentcar.layerd.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import rentcar.layerd.dao.CrudUtil;
import rentcar.layerd.dao.custom.CarDao;
import rentcar.layerd.entity.CarEntity;
import rentcar.layerd.entity.CategoryEntity;

/**
 *
 * @author TOSHIBA
 */
public class CarDaoImpl implements CarDao {

    @Override
    public boolean add(CarEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO car VALUES(?,?,?,?,?,?,?,?,?)",t.getId(),t.getCategory()
        , t.getBrand(),t.getModel(),t.getTransmission(),t.getFualType(),t.getVehicleNo(),t.getYear(),t.getPerDayPrice());
    }

    @Override
    public CarEntity get(String id) throws Exception {
         ResultSet rst= CrudUtil.executeQuery("Select * from car WHERE carID=?", id);
       
        while(rst.next()){
            CarEntity carEntity=new CarEntity(rst.getString(1),
           
           rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7),
            rst.getInt(8),rst.getDouble(9));
            return carEntity;
         
        }
        
        return new CarEntity(); 
    }

    @Override
    public boolean update(CarEntity t) throws Exception {
       return CrudUtil.executeUpdate("Update car SET category=?,brand=?,model=?,transmission=?,fualType=?,vehicleNo=?,year=?,perDayPrice=? WHERE carID=?",t.getCategory(),
               t.getBrand(),t.getModel(),t.getTransmission(),t.getFualType(),t.getVehicleNo(),t.getYear(),t.getPerDayPrice(),t.getId());
    }

    @Override
    public boolean delete(String id) throws Exception {
         return CrudUtil.executeUpdate("DELETE FROM car WHERE carID=?",id); 
    }

    @Override
    public ArrayList<CarEntity> getAll() throws Exception {
        ArrayList<CarEntity> carEntity=new ArrayList<>();
        
        ResultSet rst=CrudUtil.executeQuery("Select * from car");
        
        while(rst.next()){
            CarEntity carEntitys=new CarEntity(rst.getString(1),
           
           rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7),
            rst.getInt(8),rst.getDouble(9));
           
        carEntity.add(carEntitys);
        
        
    }

   return carEntity;
    
    }
    
}
