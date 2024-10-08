package co.edu.uniquindio.poo;


public class Person {
   
    protected  String Name;
    protected String LastName;
    protected  int PhoneNumber;
    
    public Person(String name, String lastName, int PhoneNumber) {
        this.Name = name;
        this.LastName = lastName;
        this.PhoneNumber = PhoneNumber;
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
    public int getPhoneNumber() {
        return PhoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
    
