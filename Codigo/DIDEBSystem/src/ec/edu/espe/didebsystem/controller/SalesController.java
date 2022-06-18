package ec.edu.espe.didebsystem.controller;

import ec.edu.espe.didebsystem.view.forms.sales.SalesView;
import ec.edu.espe.didebsystem.modelDAO.SalesDAO;

/**
 *
 * @author Joha
 */
public class SalesController {
    public SalesDAO model;
    public SalesView view;

    public SalesController(SalesDAO model, SalesView view) {
        this.model = model;
        this.view = view;
    }
    
    public void updateView(){
        this.view.setVisible(true);
    }
}