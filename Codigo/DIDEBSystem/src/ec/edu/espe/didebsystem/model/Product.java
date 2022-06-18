package ec.edu.espe.didebsystem.model;

/**
 *
 * @author Carlos
 */
public class Product {
    private int IDProduct;
    private String name;
    private String pricePurchase;
    private String priceSell;
    private String description;

    public Product(int IDProduct, String name, String pricePurchase, String priceSell, String description) {
        this.IDProduct = IDProduct;
        this.name = name;
        this.pricePurchase = pricePurchase;
        this.priceSell = priceSell;
        this.description = description;
    }

    public int getIDProduct() {
        return IDProduct;
    }

    public void setIDProduct(int IDProduct) {
        this.IDProduct = IDProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPricePurchase() {
        return pricePurchase;
    }

    public void setPricePurchase(String pricePurchase) {
        this.pricePurchase = pricePurchase;
    }

    public String getPriceSell() {
        return priceSell;
    }

    public void setPriceSell(String priceSell) {
        this.priceSell = priceSell;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   
    
}
