/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rentcar.layerd.service.custom;

import java.util.ArrayList;
import rentcar.layerd.dto.RentDetailsDto;
import rentcar.layerd.dto.RentDto;
import rentcar.layerd.service.SuperService;

/**
 *
 * @author TOSHIBA
 */
public interface RentDetailsService extends SuperService {
    public String addRentDetails(RentDetailsDto rentDetailsDto)throws Exception;

    public ArrayList<RentDetailsDto> getAllRentDetails()throws Exception;

    public RentDto getRentDetails(String rentId)throws Exception;

    public String updateRentDetails(RentDetailsDto rentDetailsDto)throws Exception;

    public String deleteRentDetails(String rentId)throws Exception;
}
