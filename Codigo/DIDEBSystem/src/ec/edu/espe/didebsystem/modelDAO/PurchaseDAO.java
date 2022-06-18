package ec.edu.espe.didebsystem.modelDAO;

import ec.edu.espe.didebsystem.model.Purchase;
import ec.edu.espe.didebsystem.modelDAO.ConnectionDatabase;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author luis
 */
public class PurchaseDAO {
    private static PurchaseDAO instance;
    
    public static PurchaseDAO getInstance(){
        if(instance == null) instance = new PurchaseDAO();
        return instance;
    }
    
    private PurchaseDAO() {
    }

    public ArrayList<Purchase> getPurchases(){
        ArrayList<Purchase> purchases = new ArrayList<>();
        ConnectionDatabase cdb = ConnectionDatabase.getInstance();
        Connection con = cdb.getConnection();
        ResultSet mRS = null;
        Statement mStm = null;
        try {
            mStm = con.createStatement();
            mRS = mStm.executeQuery("SELECT * FROM PURCHASE");
            while (mRS.next()) {
                purchases.add(new Purchase(
                        mRS.getInt(1),
                        mRS.getInt(2),
                        mRS.getString(3),
                        mRS.getDouble(4)
                ));
            }
        } catch (SQLException error) {
            System.out.println("Error al establecer declaración de conexión MySQL/MariaDB: " + error.getMessage());
        }
        try {
            mRS.close();
            mStm.close();
            con.close();
        } catch (SQLException error) {
            System.out.println("Error al cerrar conexión a servidor MySQL/MariaDB: " + error.getMessage());
        }
        
        return purchases;
    }

    public void addPurchase(Purchase newPurchase, ArrayList<Integer> details, ArrayList<Integer> amounts) {
        ConnectionDatabase cdb = ConnectionDatabase.getInstance();
        Connection con = cdb.getConnection();
        Statement mStm = null;

        try {
            mStm = con.createStatement();
            String query = "INSERT INTO PURCHASE VALUES("
                    + "null,\""
                    + newPurchase.getIdSupplier()+ "\",\""
                    + newPurchase.getDatePurchase()+ "\",\""
                    + newPurchase.getTotalPrice() + "\""                  
                    + ")";

            mStm.executeQuery(query);
        } catch (SQLException error) {
            System.out.println("Error al establecer declaración de conexión MySQL/MariaDB: " + error.getMessage());
        }
        try {
            mStm.close();
            con.close();
        } catch (SQLException error) {
            System.out.println("Error al cerrar conexión a servidor MySQL/MariaDB: " + error.getMessage());
        }
        
        Integer purchaseSize = this.getPurchases().size();
        Integer purchaseCode = this.getPurchases().get(purchaseSize-1).getIdPurchase();
        
        for(Integer code : details){
            cdb = ConnectionDatabase.getInstance();
            con = cdb.getConnection();
            mStm = null;
            try {
                mStm = con.createStatement();
                String query = "INSERT INTO PURCHASE_DETAILS VALUES(" + "\""
                        + purchaseCode + "\",\""
                        + code + "\""                 
                        + ")";

                mStm.executeQuery(query);
            } catch (SQLException error) {
                System.out.println("Error al establecer declaración de conexión MySQL/MariaDB: " + error.getMessage());
            }
            try {
                mStm.close();
                con.close();
            } catch (SQLException error) {
                System.out.println("Error al cerrar conexión a servidor MySQL/MariaDB: " + error.getMessage());
            }
        }

        for(int i=0; i<details.size(); i++){
            cdb = ConnectionDatabase.getInstance();
            con = cdb.getConnection();
            Statement mStm2 = null;
            ResultSet mRS = null;
            mStm = null;
            try {
                mStm2 = con.createStatement();
                mRS = mStm2.executeQuery("SELECT AMOUNT FROM INVENTORY WHERE IDPRODUCT = \""
                        + details.get(i)
                        + "\"");
                
                mRS.next();
                Integer lastAmount = mRS.getInt(1);
                Integer newAmount = lastAmount + amounts.get(i);

                mStm = con.createStatement();
                String query = "UPDATE INVENTORY SET AMOUNT = \""
                    + newAmount + "\"  WHERE IDPRODUCT = \""
                    + details.get(i) + "\"";

                mStm.executeQuery(query);
            } catch (SQLException error) {
                System.out.println("Error al establecer declaración de conexión MySQL/MariaDB: " + error.getMessage());
            }
            try {
                mRS.close();
                mStm2.close();
                mStm.close();
                con.close();
            } catch (SQLException error) {
                System.out.println("Error al cerrar conexión a servidor MySQL/MariaDB: " + error.getMessage());
            }
        }
    }
    
    public ArrayList<Integer> getProductCodesByPurchaseCode(Integer purchaseCode){
        ArrayList<Integer> products = new ArrayList<>();
        ConnectionDatabase cdb = ConnectionDatabase.getInstance();
        Connection con = cdb.getConnection();
        ResultSet mRS = null;
        Statement mStm = null;
        try {
            mStm = con.createStatement();
            mRS = mStm.executeQuery("SELECT IDPRODUCT FROM PURCHASE_DETAILS WHERE IDPURSACHE = \""
                    + purchaseCode + "\"");
            while (mRS.next()) {
                products.add(mRS.getInt(1));
            }
        } catch (SQLException error) {
            System.out.println("Error al establecer declaración de conexión MySQL/MariaDB: " + error.getMessage());
        }
        try {
            mRS.close();
            mStm.close();
            con.close();
        } catch (SQLException error) {
            System.out.println("Error al cerrar conexión a servidor MySQL/MariaDB: " + error.getMessage());
        }
        
        return products;
    }

    public void deletePurchase(String IDPurchase) {
        ConnectionDatabase cdb = ConnectionDatabase.getInstance();
        Connection con = cdb.getConnection();
        Statement mStm1 = null;
        Statement mStm2 = null;
        try {
            mStm1 = con.createStatement();
            mStm1.executeQuery("DELETE FROM PURCHASE WHERE IDPURSACHE =\""
                    + IDPurchase + "\""
            );
            
            mStm2 = con.createStatement();
            mStm2.executeQuery("DELETE FROM PURCHASE_DETAILS WHERE IDPURSACHE =\""
                    + IDPurchase + "\""
            );

        } catch (SQLException error) {
            System.out.println("Error al establecer declaración de conexión MySQL/MariaDB: " + error.getMessage());
        }
        try {
            mStm1.close();
            mStm2.close();
            con.close();
        } catch (SQLException error) {
            System.out.println("Error al cerrar conexión a servidor MySQL/MariaDB: " + error.getMessage());
        }
    }    

    public Purchase searchPurchaseByID(String purchaseID) {
        Purchase purchase = null;
        
        ConnectionDatabase cdb = ConnectionDatabase.getInstance();
        Connection con = cdb.getConnection();
        ResultSet mRS = null;
        Statement mStm = null;
        try {
            mStm = con.createStatement();
            mRS = mStm.executeQuery("SELECT * FROM PURCHASE WHERE IDPURSACHE =\""
                    +purchaseID+"\"");
            
            mRS.next();
            purchase = new Purchase(
                    mRS.getInt(1),
                    mRS.getInt(2),
                    mRS.getString(3),
                    mRS.getDouble(4)
            );
        } catch (SQLException error) {
            System.out.println("Error al establecer declaración de conexión MySQL/MariaDB: " + error.getMessage());
        }
        try {
            mRS.close();
            mStm.close();
            con.close();
        } catch (SQLException error) {
            System.out.println("Error al cerrar conexión a servidor MySQL/MariaDB: " + error.getMessage());
        }
        
        return purchase;
    }

    public ArrayList<Integer> getProductDetails(String purchaseID) {
        ArrayList<Integer> details = new ArrayList<>();
        
        ConnectionDatabase cdb = ConnectionDatabase.getInstance();
        Connection con = cdb.getConnection();
        ResultSet mRS = null;
        Statement mStm = null;
        try {
            mStm = con.createStatement();
             mRS = mStm.executeQuery("SELECT * FROM PURCHASE_DETAILS WHERE IDPURSACHE =\""
                    +purchaseID+"\"");
             
            while (mRS.next()) {
                details.add(mRS.getInt(2));
            }
        } catch (SQLException error) {
            System.out.println("Error al establecer declaración de conexión MySQL/MariaDB: " + error.getMessage());
        }
        try {
            mRS.close();
            mStm.close();
            con.close();
        } catch (SQLException error) {
            System.out.println("Error al cerrar conexión a servidor MySQL/MariaDB: " + error.getMessage());
        }
        
        return details;
    }
}
