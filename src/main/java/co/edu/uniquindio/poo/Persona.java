package co.edu.uniquindio.poo;

public class Persona {
   
    public  String Nombre;
    public  int Teléfono;

    public Persona(String nombre, int teléfono) {
        Nombre = nombre;
        Teléfono = teléfono;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getTeléfono() {
        return Teléfono;
    }
    public void setTeléfono(int teléfono) {
        Teléfono = teléfono;
    }
    
    public void GetNombre(){
        System.out.println();
       
    }
   
    
}
