/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rentcar.layerd.dao;

/**
 *
 * @author TOSHIBA
 */
public interface CrudDao <T,ID> extends SuperDao {
    
    boolean add(T t) throws Exception;
    
    T get(ID id)throws Exception;
}
