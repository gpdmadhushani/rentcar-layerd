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
public class RentDto {
    private String id;
    private String custID;
    private Date fromDate;
    private Date toDate;
    private String carID;
    private Double perdayrent;
    private Double advance;
    private Double refundDeposit;
    private Double total;
    private Double balance;

    public RentDto() {
    }

    public RentDto(String id, String custID, Date fromDate, Date toDate, String carID, Double perdayrent, Double advance, Double refundDeposit, Double total, Double balance) {
        this.id = id;
        this.custID = custID;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.carID = carID;
        this.perdayrent = perdayrent;
        this.advance = advance;
        this.refundDeposit = refundDeposit;
        this.total = total;
        this.balance = balance;
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
     * @return the perdayrent
     */
    public Double getPerdayrent() {
        return perdayrent;
    }

    /**
     * @param perdayrent the perdayrent to set
     */
    public void setPerdayrent(Double perdayrent) {
        this.perdayrent = perdayrent;
    }

    /**
     * @return the advance
     */
    public Double getAdvance() {
        return advance;
    }

    /**
     * @param advance the advance to set
     */
    public void setAdvance(Double advance) {
        this.advance = advance;
    }

    /**
     * @return the refundDeposit
     */
    public Double getRefundDeposit() {
        return refundDeposit;
    }

    /**
     * @param refundDeposit the refundDeposit to set
     */
    public void setRefundDeposit(Double refundDeposit) {
        this.refundDeposit = refundDeposit;
    }

    /**
     * @return the total
     */
    public Double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * @return the balance
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "RentDto{" + "id=" + id + ", custID=" + custID + ", fromDate=" + fromDate + ", toDate=" + toDate + ", carID=" + carID + ", perdayrent=" + perdayrent + ", advance=" + advance + ", refundDeposit=" + refundDeposit + ", total=" + total + ", balance=" + balance + '}';
    }

    
    
    
}
