package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Host extends Person{
    private List<Property> propertyManaged =  new ArrayList<>();
    private List<Person> cooperatingOwners = new ArrayList<>();
    private List<RentalAgreement> rentalAgreements = new ArrayList<>();

    public Host(int id, String fullName, Date dateOfBirth, String contact) {
        super(id, fullName, dateOfBirth, contact);
    }

    // Getter and setter

    public List<Property> getPropertyManaged() {
        return propertyManaged;
    }

    public void setPropertyManaged(List<Property> propertyManaged) {
        this.propertyManaged = propertyManaged;
    }

    public List<Person> getCooperatingOwners() {
        return cooperatingOwners;
    }

    public void setCooperatingOwners(List<Person> cooperatingOwners) {
        this.cooperatingOwners = cooperatingOwners;
    }

    public List<RentalAgreement> getRentalAgreements() {
        return rentalAgreements;
    }

    public void setRentalAgreements(List<RentalAgreement> rentalAgreements) {
        this.rentalAgreements = rentalAgreements;
    }
}
