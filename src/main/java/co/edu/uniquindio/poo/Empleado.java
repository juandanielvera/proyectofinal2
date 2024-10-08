package co.edu.uniquindio.poo;

public class Empleado {
    public int IDEmpleado;

    public Empleado (int IDEmpleado) {
        this.IDEmpleado = IDEmpleado;
    }

    public int getIDEmpleado() {
        return IDEmpleado;
    }

    public void setIDEmpleado(int iDEmpleado) {
        IDEmpleado = iDEmpleado;
    }

    public void RegistrarEmpleado(){
        System.out.println("Registrando Empleado");
    }
    
    
}
