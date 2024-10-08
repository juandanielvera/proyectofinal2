package co.edu.uniquindio.poo;

public class Cook extends Employee {

    public Cook(String IDEmployee, String name, String lastName, int PhoneNumber) {
        super(IDEmployee, name, lastName, PhoneNumber);
        
    }

    public void PrepareOrder(Order order){

        if (order.getStatus().equals("Pendiente")) {
            System.out.println("preparing order " + order.getIDOrder() + "...");
         order.setStatus("Listo");
            System.out.println(" the order " + order.getIDOrder() + " is ready.");
        } else {
            System.out.println(" the order  " + order.getIDOrder() + "has already been dispatched.");
        }
    }
}