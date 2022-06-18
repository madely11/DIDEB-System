package ec.edu.espe.didebsystem.modelDAO;

import ec.edu.espe.didebsystem.model.Product;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class ProductDAO {

    private static ProductDAO instance;

    public static ProductDAO getInstance() {
        if (instance == null) {
            instance = new ProductDAO();
        }
        return instance;
    }

    private ProductDAO() {
    }

    public ArrayList<Product> getProducts() {
        ArrayList<Product> products = new ArrayList<>();
        ConnectionDatabase cdb = ConnectionDatabase.getInstance();
        Connection con = cdb.getConnection();
        ResultSet mRS = null;
        Statement mStm = null;
        try {
            mStm = con.createStatement();
            mRS = mStm.executeQuery("SELECT * FROM PRODUCT");
            while (mRS.next()) {
                products.add(new Product(
                        mRS.getInt(1),
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

        return products;
    }

    public void insertProduct(Product newProduct) {
        ConnectionDatabase cdb = ConnectionDatabase.getInstance();
        Connection con = cdb.getConnection();
        Statement mStm = null;
        try {
            mStm = con.createStatement();
            String query = "INSERT INTO PRODUCT VALUES("
                    + "null,\""
                    + newProduct.getName() + "\",\""
                    + newProduct.getPriceSell() + "\",\""
                    + newProduct.getPricePurchase() + "\",\""
                    + newProduct.getDescription() + "\""
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

    public Product searchProductByName(String productName) {
        Product product = null;
        ConnectionDatabase cdb = ConnectionDatabase.getInstance();
        Connection con = cdb.getConnection();
        ResultSet mRS = null;
        Statement mStm = null;
        try {
            mStm = con.createStatement();
            mRS = mStm.executeQuery("SELECT * FROM PRODUCT WHERE NAMEPRODUCT =\""
                    + productName + "\"");

            mRS.next();
            product = new Product(
                    mRS.getInt(1),
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

        return product;
    }

    public ArrayList<Product> searchProductByRange(double priceMin, double priceMax) {
        ArrayList<Product> products = this.getProducts();
        ArrayList<Product> productsByRange = new ArrayList<>();

        for (Product product : products) {
            if ((Double.parseDouble(product.getPriceSell()) >= priceMin) && (Double.parseDouble(product.getPriceSell()) <= priceMax)) {
                productsByRange.add(product);
            }
        }
        return productsByRange;
    }

    public ArrayList<Integer> getCodesByName(ArrayList<String> names) {
        ArrayList<Integer> codes = new ArrayList<>();

        for (String name : names) {
            ConnectionDatabase cdb = ConnectionDatabase.getInstance();
            Connection con = cdb.getConnection();
            ResultSet mRS = null;
            Statement mStm = null;
            try {
                mStm = con.createStatement();
                mRS = mStm.executeQuery("SELECT IDPRODUCT FROM PRODUCT WHERE NAMEPRODUCT =\""
                        + name + "\"");

                mRS.next();
                codes.add(mRS.getInt(1));
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
        }

        return codes;
    }

    public ArrayList<Double> getPricesByCodes(ArrayList<Integer> codes) {
        ArrayList<Double> prices = new ArrayList<>();

        for (Integer code : codes) {
            ConnectionDatabase cdb = ConnectionDatabase.getInstance();
            Connection con = cdb.getConnection();
            ResultSet mRS = null;
            Statement mStm = null;
            try {
                mStm = con.createStatement();
                mRS = mStm.executeQuery("SELECT PURCHACEPRICE FROM PRODUCT WHERE IDPRODUCT =\""
                        + code + "\"");

                mRS.next();
                prices.add(mRS.getDouble(1));
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
        }

        return prices;
    }

    public ArrayList<String> getProductNamesByCodes(ArrayList<Integer> productCodes) {
        ArrayList<String> productNames = new ArrayList<>();

        for (Integer code : productCodes) {
            ConnectionDatabase cdb = ConnectionDatabase.getInstance();
            Connection con = cdb.getConnection();
            ResultSet mRS = null;
            Statement mStm = null;
            try {
                mStm = con.createStatement();
                mRS = mStm.executeQuery("SELECT NAMEPRODUCT FROM PRODUCT WHERE IDPRODUCT =\""
                        + code + "\"");

                mRS.next();
                productNames.add(mRS.getString(1));
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
        }

        return productNames;
    }

    public void editProduct(Product editProduct) {
        ConnectionDatabase cdb = ConnectionDatabase.getInstance();
        Connection con = cdb.getConnection();
        Statement mStm = null;
        try {
            mStm = con.createStatement();
            String query = "UPDATE PRODUCT SET PURCHACEPRICE= \""
                    + editProduct.getPricePurchase() + "\", SELLPRICE = \""
                    + editProduct.getPriceSell() + "\", DESCRIPTION = \""
                    + editProduct.getDescription() + "\" WHERE NAMEPRODUCT = \""
                    + editProduct.getName() + "\"";

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

    public void deleteProduct(String productName) {
        ConnectionDatabase cdb = ConnectionDatabase.getInstance();
        Connection con = cdb.getConnection();
        Statement mStm = null;
        try {
            mStm = con.createStatement();
            mStm.executeQuery("DELETE FROM PRODUCT WHERE NAMEPRODUCT =\""
                    + productName + "\""
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

    public void insertProductAmount(String productAmount) {
        ConnectionDatabase cdb = ConnectionDatabase.getInstance();
        Connection con = cdb.getConnection();
        Statement mStm = null;

        Integer productsSize = this.getProducts().size();
        Integer productCode = this.getProducts().get(productsSize - 1).getIDProduct();

        try {
            mStm = con.createStatement();
            String query = "INSERT INTO INVENTORY VALUES("
                    + "null,\""
                    + productCode + "\",\""
                    + productAmount + "\""
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

    public Integer getAmountByCode(int idProduct) {
        Integer amount = 0;
        ConnectionDatabase cdb = ConnectionDatabase.getInstance();
        Connection con = cdb.getConnection();
        ResultSet mRS = null;
        Statement mStm = null;
        try {
            mStm = con.createStatement();
            mRS = mStm.executeQuery("SELECT * FROM INVENTORY WHERE IDPRODUCT =\""
                    + idProduct + "\"");

            mRS.next();
            amount = mRS.getInt(3);
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

        return amount;
    }

    public ArrayList<Double> getPricesByCodes2(ArrayList<Integer> codes) {
        ArrayList<Double> prices = new ArrayList<>();

        for (Integer code : codes) {
            ConnectionDatabase cdb = ConnectionDatabase.getInstance();
            Connection con = cdb.getConnection();
            ResultSet mRS = null;
            Statement mStm = null;
            try {
                mStm = con.createStatement();
                mRS = mStm.executeQuery("SELECT SELLPRICE FROM PRODUCT WHERE IDPRODUCT =\""
                        + code + "\"");

                mRS.next();
                prices.add(mRS.getDouble(1));
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
        }

        return prices;
    }

    public Double calculateTotalPrice(ArrayList<Integer> details, ArrayList<Integer> amounts, String value) {
        Double totalPrice = 0.0;

        int counter = 0;

        if (value.equals("PURCHASE")) {
            for (Double price : getPricesByCodes(details)) {
                totalPrice += price * amounts.get(counter);
                counter++;
            }
        } else {
            for (Double price : getPricesByCodes2(details)) {
                totalPrice += price * amounts.get(counter);
                counter++;
            }
        }

        return totalPrice;
    }
}
