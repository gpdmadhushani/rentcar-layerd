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
public class RentDetailsDto {
     private String id;
    private String custID;
     private String carID;
    private Date fromDate;
    private Date toDate;
    private String custnic;

    public RentDetailsDto() {
    }

    public RentDetailsDto(String id, String custID, String carID, Date fromDate, Date toDate, String custnic) {
        this.id = id;
        this.custID = custID;
        this.carID = carID;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.custnic = custnic;
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
     * @return the custID
     */
    public String getCustID() {
        return custID;
    }

    /**
     * @param custID the custID to set
     */
    public void setCustID(String custID) {
        this.custID = custID;
    }

    /**
     * @return the carID
     */
    public String getCarID() {
        return carID;
    }

    /**
     * @param carID the carID to set
     */
    public void setCarID(String carID) {
        this.carID = carID;
    }

    /**
     * @return the fromDate
     */
    public Date getFromDate() {
        return fromDate;
    }

    /**
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    /**
     * @return the toDate
     */
    public Date getToDate() {
        return toDate;
    }

    /**
     * @param toDate the toDate to set
     */
    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    /**
     * @return the custnic
     */
    public String getCustnic() {
        return custnic;
    }

    /**
     * @param custnic the custnic to set
     */
    public void setCustnic(String custnic) {
        this.custnic = custnic;
    }

    @Override
    public String toString() {
        return "RentDetailsDto{" + "id=" + id + ", custID=" + custID + ", carID=" + carID + ", fromDate=" + fromDate + ", toDate=" + toDate + ", custnic=" + custnic + '}';
    }
    
    
    
}
