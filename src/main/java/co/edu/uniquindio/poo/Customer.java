package co.edu.uniquindio.poo;

import java.time.LocalDateTime;
import java.util.List;

public class Customer extends Person{

    private String IDCustomer;
    private String Email;
    
    public Customer(String name, String lastName, int PhoneNumber, String iDCustomer, String email) {
        super(name, lastName, PhoneNumber);
        this.IDCustomer= iDCustomer;
        this.Email= email;
    }

    public String getIDCustomer() {
        return IDCustomer;
    }

    public void setIDCustomer(String iDCustomer) {
        IDCustomer = iDCustomer;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }   

    public Reservation MakeReservation(String iDReservation, LocalDateTime DateTime, int pax){
        Reservation Reservation= new Reservation(iDReservation, DateTime, pax);
        System.out.println("Reservation made for  " + pax + " people at  " + DateTime + ".");
         return Reservation;
        
    }

    public Order PlaceOrder(List<Product> ProductsList){
        Order order= new Order(Name, null, LastName);

        for (Product product: ProductsList) {
            Order.AddProduct(product);
        }

        System.out.println("order placed with " + ProductsList.size() + " products.");
        return order;
    }
    


}

