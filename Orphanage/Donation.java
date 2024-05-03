
package Orphanage;

class Donation {
    private int donationID;
    private String donor;
    private int donorID;
    private int amount;
    private String donateDate;
    private String orphanageID;

    public Donation(int donationID, String donor, int donorID, int amount, String donateDate, String orphanageID) {
        this.donationID = donationID;
        this.donor = donor;
        this.donorID = donorID;
        this.amount = amount;
        this.donateDate = donateDate;
        this.orphanageID = orphanageID;
 }
    
    
    public String makeDonation() throws DonationException {
        // Check if donation amount is valid
        if (amount <= 0) {
            throw new DonationException("Donation amount must be greater than 0");
        }
        // Process donation
        processDonation();
        return "Donation successful";
    }

    public String processDonation() {
        // Process donation
        return "Donation processed successfully";
    }

    public String cancelDonation() {
        // Cancel donation
        return "Donation canceled";
    }
    
    
    
    public int getDonationID() {
        return donationID;
    }

    public void setDonationID(int donationID) {
        this.donationID = donationID;
    }

    public String getDonor() {
        return donor;
    }

    public void setDonor(String donor) {
        this.donor = donor;
    }

    public int getDonorID() {
        return donorID;
    }

    public void setDonorID(int donorID) {
        this.donorID = donorID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDonateDate() {
        return donateDate;
    }

    public void setDonateDate(String donateDate) {
        this.donateDate = donateDate;
    }

    public String getOrphanageID() {
        return orphanageID;
    }

    public void setOrphanageID(String orphanageID) {
        this.orphanageID = orphanageID;
    }
}

class DonationException extends Exception {
    public DonationException(String message) {
        super(message);
    }
}
