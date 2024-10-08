package co.edu.uniquindio.poo;


public class Product {
    private String IDProduct;
    private String Name;
    private Double Price;
    
    
    public Product(String iDProduct, String name, Double price) {
        this.IDProduct = iDProduct;
        this.Name = name;
        this.Price = price;
    }
    public String getIDProduct() {
        return IDProduct;
    }

    public void setIDProduct(String iDProduct) {
        IDProduct = iDProduct;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }
    public void AddProduct(){
        
    }
  
}
