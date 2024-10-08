package co.edu.uniquindio.poo;
import java.time.LocalDateTime;

public class Order{
    private String IDOrder;
    private LocalDateTime DateTime;
    private String Status;
   
    public Order(String iDOrder, LocalDateTime dateTime, String estado) {
        this.IDOrder = iDOrder;
        this.DateTime = dateTime;
        this.Status = estado;
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

    public void AddProduct(){

    }

    public void DispatchOrder(){

    }
}


        

    

