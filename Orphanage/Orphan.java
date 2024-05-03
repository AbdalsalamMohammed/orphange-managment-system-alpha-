package Orphanage;


class Orphan extends Person {
    private String orphanageID;

    public Orphan(String firstName, String lastName, char gender, String phoneNumber, String email, String dateOfBirth, String orphanageID) {
        super(firstName, lastName, gender, phoneNumber, email, dateOfBirth);
        this.orphanageID = orphanageID;
    }

    public String getOrphanageID() {
        return orphanageID;
    }

    public void setOrphanageID(String orphanageID) {
        this.orphanageID = orphanageID;
    }
}