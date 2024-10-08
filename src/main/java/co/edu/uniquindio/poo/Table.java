package co.edu.uniquindio.poo;

public class Table{
    private int TableNumber;
    private int Capacity;
    private String Status;
    
    
    public Table(int tableNumber, int capacity, String status) {
        this.TableNumber = tableNumber;
        this.Capacity = capacity;
        this.Status = status;
    }

    public int getTableNumber() {
        return TableNumber;
    }

    public void setTableNumber(int tableNumber) {
        TableNumber = tableNumber;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public void ReserveTable(){

    }
    public void ReleaseTable(){
        
    }


    
}