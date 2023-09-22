/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentcar.layerd.dao.custom.impl;

import java.util.ArrayList;
import rentcar.layerd.dao.CrudUtil;
import rentcar.layerd.dao.custom.CarReturnDao;
import rentcar.layerd.entity.CarReturnEntity;

/**
 *
 * @author TOSHIBA
 */
public class CarReturnDaoImpl implements CarReturnDao {

    @Override
    public boolean add(CarReturnEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO returncar VALUES(?,?,?,?)",t.getId(),t.getCustid()
        , t.getCarid(),t.getReturndate());
    }

    @Override
    public CarReturnEntity get(String id) throws Exception {
        return null;
    }

    @Override
    public boolean update(CarReturnEntity t) throws Exception {
         return false;
    }

    @Override
    public boolean delete(String id) throws Exception {
        return false;
    }

    @Override
    public ArrayList<CarReturnEntity> getAll() throws Exception {
       return null;
    }
    
}
