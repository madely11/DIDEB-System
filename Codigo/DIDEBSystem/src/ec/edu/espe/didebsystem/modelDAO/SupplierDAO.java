package ec.edu.espe.didebsystem.modelDAO;

import ec.edu.espe.didebsystem.model.Supplier;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author madel
 */
public class SupplierDAO {
    private static SupplierDAO instance;
    
    public static SupplierDAO getInstance(){
        if(instance == null) instance = new SupplierDAO();
        return instance;
    }
    
     private SupplierDAO() {
    }
    
    public ArrayList<Supplier> getSuppliers(){
        ArrayList<Supplier> suppliers = new ArrayList<>();
        ConnectionDatabase cdb = ConnectionDatabase.getInstance();
        Connection con = cdb.getConnection();
        ResultSet mRS = null;
        Statement mStm = null;
        try {
            mStm = con.createStatement();
            mRS = mStm.executeQuery("SELECT * FROM SUPPLIER");
            while (mRS.next()) {
                suppliers.add(new Supplier(
                        mRS.getString(2),
                        mRS.getString(3),
                        mRS.getString(4),
                        mRS.getString(5)
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
        
        return suppliers;
    }
     
    
    public void insertSupplier(Supplier newSupplier) {
        ConnectionDatabase cdb = ConnectionDatabase.getInstance();
        Connection con = cdb.getConnection();
        Statement mStm = null;
        try {
            mStm = con.createStatement();
            String query = "INSERT INTO SUPPLIER VALUES("
                    + "null,\""
                    + newSupplier.getName() + "\",\""
                    + newSupplier.getFactory() + "\",\""
                    + newSupplier.getAddress() + "\",\""
                    + newSupplier.getPhones() +"\""
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
    
    public void deleteSupplier(String supplierName) {
        ConnectionDatabase cdb = ConnectionDatabase.getInstance();
        Connection con = cdb.getConnection();
        int id = getCodeByName(supplierName);
        Statement mStm = null;
        try {
            mStm = con.createStatement();


            mStm.executeQuery("DELETE FROM SUPPLIER WHERE IDSUPPLIER =\""
                    + id +"\""
                    );
            
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
    
    
    public Integer getCodeByName(String name){
        Integer code = null;
        
        ConnectionDatabase cdb = ConnectionDatabase.getInstance();
        Connection con = cdb.getConnection();
        ResultSet mRS = null;
        Statement mStm = null;
        try {
            mStm = con.createStatement();
            mRS = mStm.executeQuery("SELECT IDSUPPLIER FROM SUPPLIER WHERE SUPPLIERNAME =\""
                    +name+"\"" + "OR FACTORYNAME =\""+name+"\"");
            
            mRS.next();
            code = mRS.getInt(1);
            
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
        
        return code;
    }
    
    public Supplier searchSupplierByName(String supplierName) {
        Supplier supplier = null;
        ConnectionDatabase cdb = ConnectionDatabase.getInstance();
        Connection con = cdb.getConnection();
        ResultSet mRS = null;
        Statement mStm = null;
        try {
            mStm = con.createStatement();
            mRS = mStm.executeQuery("SELECT * FROM SUPPLIER WHERE SUPPLIERNAME =\""
                    +supplierName+"\"");
            
            mRS.next();
            supplier = new Supplier(
                    mRS.getString(2),
                    mRS.getString(3),
                    mRS.getString(4),
                    mRS.getString(5)
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
        
        return supplier;
    }
    
    public Supplier searchSupplierByFactoryName(String factoryName) {
        Supplier supplier = null;
        ConnectionDatabase cdb = ConnectionDatabase.getInstance();
        Connection con = cdb.getConnection();
        ResultSet mRS = null;
        Statement mStm = null;
        try {
            mStm = con.createStatement();
            mRS = mStm.executeQuery("SELECT * FROM SUPPLIER WHERE FACTORYNAME =\""
                    +factoryName+"\"");
            
            while (mRS.next()) {
                supplier = new Supplier(
                        mRS.getString(2),
                        mRS.getString(3),
                        mRS.getString(4),
                        mRS.getString(5)
                );
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
        
        return supplier;
    }

    public String getNameByCode(int idSupplier) {
        String name = null;
        
        ConnectionDatabase cdb = ConnectionDatabase.getInstance();
        Connection con = cdb.getConnection();
        ResultSet mRS = null;
        Statement mStm = null;
        try {
            mStm = con.createStatement();
            mRS = mStm.executeQuery("SELECT SUPPLIERNAME FROM SUPPLIER WHERE IDSUPPLIER =\""
                    +idSupplier+"\"");
            
            mRS.next();
            name = mRS.getString(1);
            
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
        
        return name;
    }
    
}
