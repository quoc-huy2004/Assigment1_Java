package Entities;

public class Property {
    private int propertyID;
    private String address;
    private double price;
    private String status;
    private Person owner;

    public Property(int propertyID, String address, double price, String status, Person owner) {
        this.propertyID = propertyID;
        this.address = address;
        this.price = price;
        this.status = status;
        this.owner = owner;
    }

    // Getter and Setter

    public int getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(int propertyID) {
        this.propertyID = propertyID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
