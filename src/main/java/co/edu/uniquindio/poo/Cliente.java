package co.edu.uniquindio.poo;

public class Cliente{

    String Name;
    String LastName;

    public Cliente(String name, String lastName) {
        Name = name;
        LastName = lastName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    
}

