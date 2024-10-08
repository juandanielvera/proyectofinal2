package co.edu.uniquindio.poo;
import java.time.LocalDateTime;

public class Reserva {
    public String ID;
    public LocalDateTime FechaHora;
    public int Pax;
    public Reserva(String iD, LocalDateTime fechaHora, int pax) {
        ID = iD;
        FechaHora = fechaHora;
        Pax = pax;
    }
    public String getID() {
        return ID;
    }
    public void setID(String iD) {
        ID = iD;
    }
    public LocalDateTime getFechaHora() {
        return FechaHora;
    }
    public void setFechaHora(LocalDateTime fechaHora) {
        FechaHora = fechaHora;
    }
    public int getPax() {
        return Pax;
    }
    public void setPax(int pax) {
        Pax = pax;
    }

    public boolean ConfirmarReserva(){
        return false;

    }
    
    public boolean CancelarReserva(){
        return false;

    }
    
}
