package co.edu.uniquindio.poo;

public class Invoice  {
    private String IDInvoice;
    private String Date;
    private double Total;

    public Invoice(String IDInvoice, String Date, double Total) {
        this.IDInvoice = IDInvoice;
        this.Date = Date;
        this.Total = Total;
    }

    public String getIDInvoice() {
        return IDInvoice;
    }

    public void setIDInvoice(String iDInvoice) {
        IDInvoice = iDInvoice;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double total) {
        Total = total;
    }
    public void crearFactura() {
        
    }
    public void anularFactura() {
        
    }


    
}
