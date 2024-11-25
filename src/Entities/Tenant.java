package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tenant extends Person {
    private List<RentalAgreement> rentalAgreements = new ArrayList<RentalAgreement>();
    private List<Payment> paymentTransactions = new ArrayList<>();

    public Tenant(int id, String fullName, Date dateOfBirth, String contact) {
        super(id, fullName, dateOfBirth, contact);
    }

    // Getter and Setter

    public List<RentalAgreement> getRentalAgreements() {
        return rentalAgreements;
    }

    public void setRentalAgreements(List<RentalAgreement> rentalAgreements) {
        this.rentalAgreements = rentalAgreements;
    }

    public List<Payment> getPaymentTransactions() {
        return paymentTransactions;
    }

    public void setPaymentTransactions(List<Payment> paymentTransactions) {
        this.paymentTransactions = paymentTransactions;
    }
}
