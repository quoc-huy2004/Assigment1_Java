package Function;

import Entities.*;
import Function.RentalManager;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentalManagerImpl implements RentalManager {
    private List<RentalAgreement> rentalAgreements = new ArrayList<>();
    private List<Tenant> tenants = new ArrayList<>();
    private List<Host> hosts = new ArrayList<>();
    private List<Owner> owners = new ArrayList<>();
    private List<ResidentialProperty> residentialProperties = new ArrayList<>();
    private List<CommercialProperty> commercialProperties = new ArrayList<>();
    @Override
    public void addRentalAgreement(RentalAgreement agreement) {
        rentalAgreements.add(agreement);
    }

    @Override
    public void updateRentalAgreement(String agreementId, RentalAgreement updatedAgreement) {
        for (int i = 0; i < rentalAgreements.size(); i++) {
            if (rentalAgreements.get(i).getAgreementId() == agreementId) {
                rentalAgreements.set(i, updatedAgreement);
                return;
            }
        }
        System.out.println("Rental Agreement not found.");
    }

    @Override
    public void deleteRentalAgreement(String agreementId) {
        rentalAgreements.removeIf(agreement -> agreement.getAgreementId().equals(agreementId));
    }

    @Override
    public List<RentalAgreement> getAllRentalAgreements() {
        return new ArrayList<>(rentalAgreements);
    }

    @Override
    public List<RentalAgreement> getRentalAgreementsByOwnerName(String ownerName) {
        return rentalAgreements.stream()
                .filter(agreement -> agreement.getOwner().getFullName().equalsIgnoreCase(ownerName))
                .collect(Collectors.toList());
    }

    @Override
    public List<RentalAgreement> getRentalAgreementsByPropertyAddress(String propertyAddress) {
        return rentalAgreements.stream()
                .filter(agreement -> agreement.getProperty().getAddress().equalsIgnoreCase(propertyAddress))
                .collect(Collectors.toList());
    }

    @Override
    public List<RentalAgreement> getRentalAgreementsByStatus(String status) {
        return rentalAgreements.stream()
                .filter(agreement -> agreement.getStatus().equalsIgnoreCase(status))
                .collect(Collectors.toList());
    }

    @Override
    public List<Tenant> getAllTenants() {
        return new ArrayList<>(tenants);
    }

    @Override
    public List<Host> getAllHosts() {
        return new ArrayList<>(hosts);
    }

    @Override
    public List<Owner> getAllOwners() {
        return new ArrayList<>(owners);
    }

    @Override
    public List<ResidentialProperty> getAllResidentialProperties() {
        return new ArrayList<>(residentialProperties);
    }

    @Override
    public List<CommercialProperty> getAllCommercialProperties() {
        return new ArrayList<>(commercialProperties);
    }

    @Override
    public void saveDataToFile(String filePath) {

    }

    @Override
    public void loadDataFromFile(String filePath) {

    }
}
