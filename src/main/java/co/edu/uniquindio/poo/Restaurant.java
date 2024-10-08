package co.edu.uniquindio.poo;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String Name;
    private List<Person> PersonsList;
    private List<Table> TablesList;
    private List<Product> ProductsList;
    
    public Restaurant(String name, List<Person> personsList, List<Table> tablesList, List<Product> productsList) {
        this.Name = name;
        this.PersonsList = new ArrayList<>();
        this.TablesList = new ArrayList<>();
        this.ProductsList = new ArrayList<>();
    }

    public String getNombre() {
        return Name;
    }

    public void setNombre(String name) {
        Name = name;
    }

    public List<Person> getPersonsList() {
        return PersonsList;
    }

    public void setPersonsList(List<Person> personsList) {
        PersonsList = personsList;
    }

    public List<Table> getTablesList() {
        return TablesList;
    }

    public void setTablesList(List<Table> tablesList) {
        TablesList = tablesList;
    }

    public List<Product> getProductsList() {
        return ProductsList;
    }

    public void setProductsList(List<Product> productsList) {
        ProductsList = productsList;
    }

    public void AddPerson(Person person) {
        PersonsList.add(person);
    }

    public void AddTable(Table table) {
        TablesList.add(table);
    }
    public void AddProduct(Product product) {
        ProductsList.add(product);
    }
 
}
