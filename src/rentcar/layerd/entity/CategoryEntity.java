/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentcar.layerd.entity;

/**
 *
 * @author TOSHIBA
 */
public class CategoryEntity {
    private String categoryID;
    private String name;

    public CategoryEntity() {
    }

    public CategoryEntity(String categoryID, String name) {
        this.categoryID = categoryID;
        this.name = name;
    }

    /**
     * @return the categoryID
     */
    public String getCategoryID() {
        return categoryID;
    }

    /**
     * @param categoryID the categoryID to set
     */
    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CategoryEntity{" + "categoryID=" + categoryID + ", name=" + name + '}';
    }
    
     
    
     
    
    
    
}
