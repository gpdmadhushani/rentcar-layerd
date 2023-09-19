/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentcar.layerd.entity;

/**
 *
 * @author TOSHIBA
 */
public class CarEntity {
    private String id;
    private String category;
     private String brand;
      private String model;
       private String transmission;
        private String fualType;
         private String vehicleNo;
         private Integer year;
         private Double perDayPrice;

    public CarEntity() {
    }

    public CarEntity(String id, String category, String brand, String model, String transmission, String fualType, String vehicleNo, Integer year, Double perDayPrice) {
        this.id = id;
        this.category = category;
        this.brand = brand;
        this.model = model;
        this.transmission = transmission;
        this.fualType = fualType;
        this.vehicleNo = vehicleNo;
        this.year = year;
        this.perDayPrice = perDayPrice;
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
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the transmission
     */
    public String getTransmission() {
        return transmission;
    }

    /**
     * @param transmission the transmission to set
     */
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    /**
     * @return the fualType
     */
    public String getFualType() {
        return fualType;
    }

    /**
     * @param fualType the fualType to set
     */
    public void setFualType(String fualType) {
        this.fualType = fualType;
    }

    /**
     * @return the vehicleNo
     */
    public String getVehicleNo() {
        return vehicleNo;
    }

    /**
     * @param vehicleNo the vehicleNo to set
     */
    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    /**
     * @return the year
     */
    public Integer getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * @return the perDayPrice
     */
    public Double getPerDayPrice() {
        return perDayPrice;
    }

    /**
     * @param perDayPrice the perDayPrice to set
     */
    public void setPerDayPrice(Double perDayPrice) {
        this.perDayPrice = perDayPrice;
    }

    @Override
    public String toString() {
        return "CarEntity{" + "id=" + id + ", category=" + category + ", brand=" + brand + ", model=" + model + ", transmission=" + transmission + ", fualType=" + fualType + ", vehicleNo=" + vehicleNo + ", year=" + year + ", perDayPrice=" + perDayPrice + '}';
    }
         
    
}
