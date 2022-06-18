package ec.edu.espe.didebsystem.modelDAO;

import ec.edu.espe.didebsystem.model.Sales;
import ec.edu.espe.didebsystem.modelDAO.ConnectionDatabase;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author joha
 */
public class SalesDAO {

    private static SalesDAO instance;

    public static SalesDAO getInstance() {
        if (instance == null) {
            instance = new SalesDAO();
        }
        return instance;
    }

    private SalesDAO() {
    }

    public ArrayList<Sales> getSales() {
        ArrayList<Sales> sales = new ArrayList<>();
        ConnectionDatabase cdb = ConnectionDatabase.getInstance();
        Connection con = cdb.getConnection();
        ResultSet mRS = null;
        Statement mStm = null;
        try {
            mStm = con.createStatement();
            mRS = mStm.executeQuery("SELECT * FROM SALE");
            while (mRS.next()) {
                sales.add(new Sales(
                        mRS.getInt(1),
                        mRS.getInt(2),
                        mRS.getString(3),
                        mRS.getDouble(4),
                        mRS.getDouble(5)
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

        return sales;
    }

    public void addSale(Sales newSales, ArrayList<Integer> details, ArrayList<Integer> amounts) {
        ConnectionDatabase cdb = ConnectionDatabase.getInstance();
        Connection con = cdb.getConnection();
        Statement mStm = null;

        try {
            mStm = con.createStatement();
            String query = "INSERT INTO SALE VALUES("
                    + "null,\""
                    + newSales.getIdClient() + "\",\""
                    + newSales.getDateSale() + "\",\""
                    + newSales.getTotalPrice() + "\",\""
                    + newSales.getPayment() + "\""
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

        Integer salesSize = this.getSales().size();
        Integer salesCode = this.getSales().get(salesSize - 1).getIdSale();

        for (Integer code : details) {
            cdb = ConnectionDatabase.getInstance();
            con = cdb.getConnection();
            mStm = null;
            try {
                mStm = con.createStatement();
                String query = "INSERT INTO SALE_DETAILS VALUES(" + "\""
                        + salesCode + "\",\""
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

        for (int i = 0; i < details.size(); i++) {
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
                Integer newAmount = lastAmount - amounts.get(i);

                if (newAmount >= 0) {
                    mStm = con.createStatement();
                    String query = "UPDATE INVENTORY SET AMOUNT = \""
                            + newAmount + "\"  WHERE IDPRODUCT = \""
                            + details.get(i) + "\"";

                    mStm.executeQuery(query);
                }
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

    public ArrayList<Integer> getProductCodesBySaleCode(Integer saleCode) {
        ArrayList<Integer> products = new ArrayList<>();
        ConnectionDatabase cdb = ConnectionDatabase.getInstance();
        Connection con = cdb.getConnection();
        ResultSet mRS = null;
        Statement mStm = null;
        try {
            mStm = con.createStatement();
            mRS = mStm.executeQuery("SELECT SALEID FROM SALE_DETAILS WHERE IDPRODUCT = \""
                    + saleCode + "\"");
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

    public void deleteSales(String saleID) {
        ConnectionDatabase cdb = ConnectionDatabase.getInstance();
        Connection con = cdb.getConnection();
        Statement mStm = null;
        Statement mStm2 = null;

        try {
            mStm = con.createStatement();
            mStm.executeQuery("DELETE FROM SALE WHERE SALEID =\""
                    + saleID + "\""
            );

            mStm2 = con.createStatement();
            mStm2.executeQuery("DELETE FROM SALE_DETAILS WHERE SALEID =\""
                    + saleID + "\""
            );

        } catch (SQLException error) {
            System.out.println("Error al establecer declaración de conexión MySQL/MariaDB: " + error.getMessage());
        }
        try {
            mStm2.close();
            mStm.close();
            con.close();
        } catch (SQLException error) {
            System.out.println("Error al cerrar conexión a servidor MySQL/MariaDB: " + error.getMessage());
        }
    }

    public Sales searchSalesBySaleID(String saleID) {
        Sales sale = null;
        ConnectionDatabase cdb = ConnectionDatabase.getInstance();
        Connection con = cdb.getConnection();
        ResultSet mRS = null;
        Statement mStm = null;
        try {
            mStm = con.createStatement();
            mRS = mStm.executeQuery("SELECT * FROM SALE WHERE SALEID =\""
                    + saleID + "\"");

            mRS.next();
            sale = new Sales(
                    mRS.getInt(1),
                    mRS.getInt(2),
                    mRS.getString(3),
                    mRS.getDouble(4),
                    mRS.getDouble(5)
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

        return sale;
    }

    public void editSale(Sales sale) {
        ConnectionDatabase cdb = ConnectionDatabase.getInstance();
        Connection con = cdb.getConnection();
        Statement mStm = null;
        try {
            mStm = con.createStatement();
            String query = "UPDATE SALE SET PAYMENT = \""
                    + sale.getPayment() + "\" WHERE SALEID = \""
                    + sale.getIdSale() + "\"";

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
}
