/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.didebsystem.controller;

import ec.edu.espe.didebsystem.modelDAO.ClientDAO;
import ec.edu.espe.didebsystem.modelDAO.ProductDAO;
import ec.edu.espe.didebsystem.view.forms.clients.ClientView;
import ec.edu.espe.didebsystem.view.forms.product.ProductView;

/**
 *
 * @author Carlos
 */
public class ProductController {
     public ProductDAO model;
    public ProductView view;

    public ProductController(ProductDAO model, ProductView view) {
        this.model = model;
        this.view = view;
    }
    
    public void updateView(){
        this.view.setVisible(true);
    }
}
