package Entities;

public class ResidentialProperty extends Property {
    private int bedroomNum;
    private boolean gardenAvailability;
    private boolean petFriendliness;

    public ResidentialProperty(int propertyID, String address, double price, String status, Person owner, int bedroomNum, boolean gardenAvailability, boolean petFriendliness) {
        super(propertyID, address, price, status, owner);
        this.bedroomNum = bedroomNum;
        this.gardenAvailability = gardenAvailability;
        this.petFriendliness = petFriendliness;
    }

    // Getter and Setter

    public int getBedroomNum() {
        return bedroomNum;
    }

    public void setBedroomNum(int bedroomNum) {
        this.bedroomNum = bedroomNum;
    }

    public boolean isGardenAvailability() {
        return gardenAvailability;
    }

    public void setGardenAvailability(boolean gardenAvailability) {
        this.gardenAvailability = gardenAvailability;
    }

    public boolean isPetFriendliness() {
        return petFriendliness;
    }

    public void setPetFriendliness(boolean petFriendliness) {
        this.petFriendliness = petFriendliness;
    }
}
