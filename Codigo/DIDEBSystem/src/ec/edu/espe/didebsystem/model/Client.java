package ec.edu.espe.didebsystem.model;

/**
 *
 * @author sebask8er
 */
public class Client {
    private String name;
    private String clinicName;
    private String address;
    private String phones;

    public Client(String name, String clinicName, String address, String phones) {
        this.name = name;
        this.clinicName = clinicName;
        this.address = address;
        this.phones = phones;
    }

    public Client() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhones() {
        return phones;
    }

    public void setPhones(String phones) {
        this.phones = phones;
    }
}
