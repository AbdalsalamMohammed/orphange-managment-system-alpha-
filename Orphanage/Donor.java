package Orphanage;

class Donor extends Person {
    private String donorID;
    private String dateOfFirstDonation;

    public Donor(String firstName, String lastName, char gender, String phoneNumber, String email, String dateOfBirth, String donorID, String dateOfFirstDonation) {
        super(firstName, lastName, gender, phoneNumber, email, dateOfBirth);
        this.donorID = donorID;
        this.dateOfFirstDonation = dateOfFirstDonation;
    }

    public String getDonorID() {
        return donorID;
    }

    public void setDonorID(String donorID) {
        this.donorID = donorID;
    }

    public String getDateOfFirstDonation() {
        return dateOfFirstDonation;
    }

    public void setDateOfFirstDonation(String dateOfFirstDonation) {
        this.dateOfFirstDonation = dateOfFirstDonation;
    }
}
