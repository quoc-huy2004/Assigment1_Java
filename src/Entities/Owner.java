package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Owner extends Person {
    private List<Property> ownedProperties = new ArrayList<>();
    private List<Host> hostsManaging = new ArrayList<>();
    private List<RentalAgreement> rentalAgreements = new ArrayList<>();
    public Owner(int id, String fullName, Date dateOfBirth, String contact) {
        super(id, fullName, dateOfBirth, contact);
    }

    // Getter and Setter

    public List<Property> getOwnedProperties() {
        return ownedProperties;
    }

    public void setOwnedProperties(List<Property> ownedProperties) {
        this.ownedProperties = ownedProperties;
    }

    public List<Host> getHostsManaging() {
        return hostsManaging;
    }

    public void setHostsManaging(List<Host> hostsManaging) {
        this.hostsManaging = hostsManaging;
    }

    public List<RentalAgreement> getRentalAgreements() {
        return rentalAgreements;
    }

    public void setRentalAgreements(List<RentalAgreement> rentalAgreements) {
        this.rentalAgreements = rentalAgreements;
    }
}
