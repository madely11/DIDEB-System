package ec.edu.espe.didebsystem.controller;

import ec.edu.espe.didebsystem.view.forms.clients.ClientView;
import ec.edu.espe.didebsystem.modelDAO.ClientDAO;

/**
 *
 * @author sebask8er
 */
public class ClientController {
    public ClientDAO model;
    public ClientView view;

    public ClientController(ClientDAO model, ClientView view) {
        this.model = model;
        this.view = view;
    }
    
    public void updateView(){
        this.view.setVisible(true);
    }
}
