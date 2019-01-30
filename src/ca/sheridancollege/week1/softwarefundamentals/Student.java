/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author test
 */
public class Student {

    private int ID;
    private String name;
    
    private String Phone;

    /**
     * Get the value of Phone
     *
     * @return the value of Phone
     */
    public String getPhone() {
        return Phone;
    }

    /**
     * Set the value of Phone
     *
     * @param Phone new value of Phone
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    
    private String Address;
  
     /**
     * Get the value of Address
     *
     * @return the value of Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * Set the value of Address
     *
     * @param Address new value of Address
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

     /* Get the value of ID
     *
     * @return the value of ID
     */
    public int getID() {
        return ID;
    }

    public Student(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    /**
     * Set the value of ID
     *
     * @param ID new value of ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }
   

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of string
     *
     * @param string new value of string
     */
    public void setName(String name) {
        this.name = name;
    }

    
}
