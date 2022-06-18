package ec.edu.espe.didebsystem.modelDAO;

import ec.edu.espe.didebsystem.model.Client;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author sebask8er
 */
public class ClientDAO {

    private static ClientDAO instance;

    public static ClientDAO getInstance() {
        if (instance == null) {
            instance = new ClientDAO();
        }
        return instance;
    }

    private ClientDAO() {
    }

    public ArrayList<Client> getClients() {
        ArrayList<Client> clients = new ArrayList<>();
        ConnectionDatabase cdb = ConnectionDatabase.getInstance();
        Connection con = cdb.getConnection();
        ResultSet mRS = null;
        Statement mStm = null;
        try {
            mStm = con.createStatement();
            mRS = mStm.executeQuery("SELECT * FROM CLIENT");
            while (mRS.next()) {
                clients.add(new Client(
                        mRS.getString(2),
                        mRS.getString(3),
                        mRS.getString(5),
                        mRS.getString(4)
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

        return clients;
    }

    public void insertClient(Client newClient) {
        ConnectionDatabase cdb = ConnectionDatabase.getInstance();
        Connection con = cdb.getConnection();
        Statement mStm = null;
        try {
            mStm = con.createStatement();
            String query = "INSERT INTO CLIENT VALUES("
                    + "null,\""
                    + newClient.getName() + "\",\""
                    + newClient.getClinicName() + "\",\""
                    + newClient.getPhones() + "\",\""
                    + newClient.getAddress() + "\""
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

    public void deleteClient(String clientName) {
        ConnectionDatabase cdb = ConnectionDatabase.getInstance();
        Connection con = cdb.getConnection();
        Statement mStm = null;
        try {
            mStm = con.createStatement();
            mStm.executeQuery("DELETE FROM CLIENT WHERE CLIENTNAME =\""
                    + clientName + "\""
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

    public Integer getCodeByName(String name) {
        Integer code = null;

        ConnectionDatabase cdb = ConnectionDatabase.getInstance();
        Connection con = cdb.getConnection();
        ResultSet mRS = null;
        Statement mStm = null;
        try {
            mStm = con.createStatement();
            mRS = mStm.executeQuery("SELECT CLIENTID FROM CLIENT WHERE CLIENTNAME =\""
                    + name + "\"");

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
    public String getNameByCode(int idClient) {
        String name = null;
        
        ConnectionDatabase cdb = ConnectionDatabase.getInstance();
        Connection con = cdb.getConnection();
        ResultSet mRS = null;
        Statement mStm = null;
        try {
            mStm = con.createStatement();
            mRS = mStm.executeQuery("SELECT CLIENTNAME FROM CLIENT WHERE CLIENTID =\""
                    +idClient+"\"");
            
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

    public Client searchClientByName(String clientName) {
        Client client = null;
        ConnectionDatabase cdb = ConnectionDatabase.getInstance();
        Connection con = cdb.getConnection();
        ResultSet mRS = null;
        Statement mStm = null;
        try {
            mStm = con.createStatement();
            mRS = mStm.executeQuery("SELECT * FROM CLIENT WHERE CLIENTNAME =\""
                    + clientName + "\"");

            mRS.next();
            client = new Client(
                    mRS.getString(2),
                    mRS.getString(3),
                    mRS.getString(5),
                    mRS.getString(4)
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

        return client;
    }

    public ArrayList<Client> searchClientByClinicName(String clinicName) {
        ArrayList<Client> clients = new ArrayList<>();
        ConnectionDatabase cdb = ConnectionDatabase.getInstance();
        Connection con = cdb.getConnection();
        ResultSet mRS = null;
        Statement mStm = null;
        try {
            mStm = con.createStatement();
            mRS = mStm.executeQuery("SELECT * FROM CLIENT WHERE CLINICNAME =\""
                    + clinicName + "\"");

            while (mRS.next()) {
                clients.add(new Client(
                        mRS.getString(2),
                        mRS.getString(3),
                        mRS.getString(5),
                        mRS.getString(4)
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

        return clients;
    }

    public void editClient(Client editClient) {
        ConnectionDatabase cdb = ConnectionDatabase.getInstance();
        Connection con = cdb.getConnection();
        Statement mStm = null;
        try {
            mStm = con.createStatement();
            String query = "UPDATE CLIENT SET CLIENTADDRESS = \""
                    + editClient.getAddress() + "\", CLINICNAME = \""
                    + editClient.getClinicName() + "\", CLIENTPHONES = \""
                    + editClient.getPhones() + "\" WHERE CLIENTNAME = \""
                    + editClient.getName() + "\"";

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
