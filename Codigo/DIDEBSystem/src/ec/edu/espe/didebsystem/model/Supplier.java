/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.didebsystem.model;

/**
 *
 * @author madel
 */
public class Supplier {
    private String name;
    private String factory;
    private String address;
    private String phones;

    
    public Supplier(String name, String factory, String address, String phones) {
        this.name = name;
        this.factory = factory;
        this.address = address;
        this.phones = phones;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getFactory() {
        return factory;
    }


    public void setFactory(String factory) {
        this.factory = factory;
    }

    
    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    
    public String getPhones() {
        return phones;
    }

    
    public void setPhones(String phones) {
        this.phones = phones;
    }
    
}
