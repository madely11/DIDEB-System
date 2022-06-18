/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.didebsystem.controller;

import ec.edu.espe.didebsystem.modelDAO.SupplierDAO;
import ec.edu.espe.didebsystem.view.forms.supplier.SupplierView;

/**
 *
 * @author madel
 */
public class SupplierController {
    public SupplierDAO model;
    public SupplierView view;
    
    public SupplierController(SupplierDAO model, SupplierView view) {
        this.model = model;
        this.view = view;
    }
    
    public void updateView(){
        this.view.setVisible(true);
    }
}
