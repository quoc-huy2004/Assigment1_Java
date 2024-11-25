package Entities;

import java.util.Date;
import java.util.List;

public class RentalAgreement {
    private int agreementId;
    private Tenant mainTenant;
    private List<Tenant> subTenants;
    private Property property;
    private Date contractDate;
    private double rentingFee;
    private String status;

    public RentalAgreement(int agreementId, List<Tenant> subTenants, Tenant mainTenant, Property property, Date contractDate, double rentingFee, String status) {
        this.agreementId = agreementId;
        this.subTenants = subTenants;
        this.mainTenant = mainTenant;
        this.property = property;
        this.contractDate = contractDate;
        this.rentingFee = rentingFee;
        this.status = status;
    }

    // Getter and Setter

    public int getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(int agreementId) {
        this.agreementId = agreementId;
    }

    public Tenant getMainTenant() {
        return mainTenant;
    }

    public void setMainTenant(Tenant mainTenant) {
        this.mainTenant = mainTenant;
    }

    public List<Tenant> getSubTenants() {
        return subTenants;
    }

    public void setSubTenants(List<Tenant> subTenants) {
        this.subTenants = subTenants;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public Date getContractDate() {
        return contractDate;
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

    public double getRentingFee() {
        return rentingFee;
    }

    public void setRentingFee(double rentingFee) {
        this.rentingFee = rentingFee;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
