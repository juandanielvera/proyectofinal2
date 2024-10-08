package co.edu.uniquindio.poo;

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

    public void MakeReservation(){

    }

    public void PlaceOrder(){

    }
}

