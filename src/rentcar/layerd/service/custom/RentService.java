/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rentcar.layerd.service.custom;

import java.util.ArrayList;
import rentcar.layerd.dto.RentDto;
import rentcar.layerd.service.SuperService;

/**
 *
 * @author TOSHIBA
 */
public interface RentService extends SuperService {

    public String addRent(RentDto rentDto)throws Exception;

    public ArrayList<RentDto> getAllRent()throws Exception;

    public RentDto getRent(String rentId)throws Exception;

    public String updateRent(RentDto rentDto)throws Exception;

    public String deleteRent(String rentId)throws Exception;
    
}
