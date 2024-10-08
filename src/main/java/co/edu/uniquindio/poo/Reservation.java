package co.edu.uniquindio.poo;
import java.time.LocalDateTime;

public class Reservation {
   private String IDReservation;
   private LocalDateTime DateTime;
   private int Pax;

   public Reservation(String iDReservation, LocalDateTime DateTime, int pax) {
    this.IDReservation = iDReservation;
    this.DateTime = DateTime;
    this.Pax = pax;
}

public String getIDReservation() {
    return IDReservation;
}

public void setIDReservation(String iDReservation) {
    IDReservation = iDReservation;
}

public LocalDateTime getDateTime() {
    return DateTime;
}

public void setFechaHora(LocalDateTime DateTime) {
    this.DateTime = DateTime;
}

public int getPax() {
    return Pax;
}

public void setPax(int pax) {
    Pax = pax;
}

public void ConfirmReservation(){

}

public void CancelReservation(){

}
 
}
    
