package Function;

import Entities.*;

import java.util.List;

public interface RentalManager {
    // Methods to manage rental agreements
    void addRentalAgreement(RentalAgreement agreement);
    void updateRentalAgreement(String agreementId, RentalAgreement updatedAgreement);
    void deleteRentalAgreement(String agreementId);
    List<RentalAgreement> getAllRentalAgreements();
    List<RentalAgreement> getRentalAgreementsByOwnerName(String ownerName);
    List<RentalAgreement> getRentalAgreementsByPropertyAddress(String propertyAddress);
    List<RentalAgreement> getRentalAgreementsByStatus(String status);

    List<Tenant> getAllTenants();
    List<Host> getAllHosts();
    List<Owner> getAllOwners();
    List<ResidentialProperty> getAllResidentialProperties();
    List<CommercialProperty> getAllCommercialProperties();

    // Save and load data
    void saveDataToFile(String filePath);
    void loadDataFromFile(String filePath);
}


