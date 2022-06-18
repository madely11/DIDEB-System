package ec.edu.espe.didebsystem.main;

import ec.edu.espe.didebsystem.view.forms.Login;


/**
 *
 * @author madel
 */
public class Main {

    public static void main(String[] args) {
        Login login = Login.getInstance();
        login.setVisible(true);
    }
}
