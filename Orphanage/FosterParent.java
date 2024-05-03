package Orphanage;


class FosterParent extends Person {
    private int relationToChild;


    public FosterParent(String firstName, String lastName, char gender, String phoneNumber, String email, String dateOfBirth, int relationToChild) {
        super(firstName, lastName, gender, phoneNumber, email, dateOfBirth);
        this.relationToChild = relationToChild;
    }

    public int getRelationToChild() {
        return relationToChild;
    }

    public void setRelationToChild(int relationToChild) {
        this.relationToChild = relationToChild;
    }
}
