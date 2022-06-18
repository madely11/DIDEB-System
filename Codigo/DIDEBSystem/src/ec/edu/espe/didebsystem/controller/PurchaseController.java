package ec.edu.espe.didebsystem.controller;

import ec.edu.espe.didebsystem.modelDAO.PurchaseDAO;
import ec.edu.espe.didebsystem.view.forms.purchase.PurchaseView;

/**
 *
 * @author luis
 */
public class PurchaseController {
    private PurchaseDAO model;
    private PurchaseView view;

    public PurchaseController(PurchaseDAO model, PurchaseView view) {
        this.model = model;
        this.view = view;
    }
    
    public void updateView(){
        this.view.setVisible(true);
    }
}
