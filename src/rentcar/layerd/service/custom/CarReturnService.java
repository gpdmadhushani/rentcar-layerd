/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rentcar.layerd.service.custom;

import rentcar.layerd.dto.CarReturnDto;
import rentcar.layerd.service.SuperService;

/**
 *
 * @author TOSHIBA
 */
public interface CarReturnService extends SuperService {
     String addReturn(CarReturnDto carDto) throws Exception;
}
