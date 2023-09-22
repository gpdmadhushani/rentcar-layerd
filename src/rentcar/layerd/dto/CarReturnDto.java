/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentcar.layerd.dto;

import java.util.Date;

/**
 *
 * @author TOSHIBA
 */
public class CarReturnDto {
     private String id;
    private String custid;
    private String carid;
     private Date returndate;

    public CarReturnDto() {
    }

    public CarReturnDto(String id, String custid, String carid, Date returndate) {
        this.id = id;
        this.custid = custid;
        this.carid = carid;
        this.returndate = returndate;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the custid
     */
    public String getCustid() {
        return custid;
    }

    /**
     * @param custid the custid to set
     */
    public void setCustid(String custid) {
        this.custid = custid;
    }

    /**
     * @return the carid
     */
    public String getCarid() {
        return carid;
    }

    /**
     * @param carid the carid to set
     */
    public void setCarid(String carid) {
        this.carid = carid;
    }

    /**
     * @return the returndate
     */
    public Date getReturndate() {
        return returndate;
    }

    /**
     * @param returndate the returndate to set
     */
    public void setReturndate(Date returndate) {
        this.returndate = returndate;
    }

    @Override
    public String toString() {
        return "CarReturnDto{" + "id=" + id + ", custid=" + custid + ", carid=" + carid + ", returndate=" + returndate + '}';
    }
     

   
     
     
}
