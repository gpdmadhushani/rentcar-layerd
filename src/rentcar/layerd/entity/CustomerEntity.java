/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentcar.layerd.entity;

/**
 *
 * @author TOSHIBA
 */
public class CustomerEntity {
    private String id;
    private String name;
    private String title;
    private String nic;
    private String gender;
    private String address;
    private String contact;

    public CustomerEntity() {
    }

    public CustomerEntity(String id, String name, String title, String nic, String gender, String address, String contact) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.nic = nic;
        this.gender = gender;
        this.address = address;
        this.contact = contact;
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

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "CustomerEntity{" + "id=" + id + ", name=" + name + ", title=" + title + ", nic=" + nic + ", gender=" + gender + ", address=" + address + ", contact=" + contact + '}';
    }
    
    
    
    
}
