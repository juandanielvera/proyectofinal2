package co.edu.uniquindio.poo;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order{
    private String IDOrder;
    private LocalDateTime DateTime;
    private String Status;
    private List<Product> products;
    
    
    public Order(String iDOrder, LocalDateTime dateTime, String status, List<Product> products) {
        this.IDOrder = iDOrder;
        this.DateTime = dateTime;
        this.Status = status;
        this.products = new ArrayList<>();
    }
    public String getIDOrder() {
        return IDOrder;
    }
    public void setIDOrder(String iDOrder) {
        IDOrder = iDOrder;
    }
    public LocalDateTime getDateTime() {
        return DateTime;
    }
    public void setDateTime(LocalDateTime dateTime) {
        DateTime = dateTime;
    }
    public String getStatus() {
        return Status;
    }
    public void setStatus(String status) {
        Status = status;
    }
    public List<Product> getProducts() {
        return products;
    }
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void AddProduct(Product product){

    }

    public void DispatchOrder(){
    }
   
   
}

    

