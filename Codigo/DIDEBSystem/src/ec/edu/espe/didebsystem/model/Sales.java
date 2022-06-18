package ec.edu.espe.didebsystem.model;

/**
 *
 * @author Joha
 */
public class Sales {
    private int idSale;
    private int idClient;
    private String dateSale;
    private Double totalPrice;
    private Double payment;

    public Sales(int idSale, int idClient, String dateSale, Double totalPrice, Double payment) {
        this.idSale = idSale;
        this.idClient = idClient;
        this.dateSale = dateSale;
        this.totalPrice = totalPrice;
        this.payment = payment;
    }
    
    public Sales() {
    }

    public Double getPayment() {
        return payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getIdSale() {
        return idSale;
    }

    public void setIdSale(int idSale) {
        this.idSale = idSale;
    }

    public String getDateSale() {
        return dateSale;
    }

    public void setDateSale(String dateSale) {
        this.dateSale = dateSale;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }
    
    public Double getRestOfPayment(){
        return totalPrice - payment;
    }
}
