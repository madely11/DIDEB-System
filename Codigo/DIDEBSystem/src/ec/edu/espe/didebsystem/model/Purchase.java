package ec.edu.espe.didebsystem.model;

/**
 *
 * @author luis
 */
public class Purchase {
    private int idPurchase;
    private int idSupplier;
    private String datePurchase;
    private Double totalPrice;

    public Purchase(int idPurchase, int idSupplier, String datePurchase, Double totalPrice) {
        this.idPurchase = idPurchase;
        this.idSupplier = idSupplier;
        this.datePurchase = datePurchase;
        this.totalPrice = totalPrice;
    }
    
    
    public Purchase() {
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getIdPurchase() {
        return idPurchase;
    }

    public void setIdPurchase(int idPurchase) {
        this.idPurchase = idPurchase;
    }

    public int getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(int idSupplier) {
        this.idSupplier = idSupplier;
    }

    public String getDatePurchase() {
        return datePurchase;
    }

    public void setDatePurchase(String datePurchase) {
        this.datePurchase = datePurchase;
    }
}
