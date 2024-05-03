package Orphanage;

class MedicalRecord {
    private String id;
    private String childID;
    private String medicationCondition;

    public MedicalRecord(String id, String childID, String medicationCondition) {
        this.id = id;
        this.childID = childID;
        this.medicationCondition = medicationCondition;
    }

    public boolean verifyMedicalRecord() throws MedicalRecordVerificationException {

        if (medicationCondition == null || medicationCondition.isEmpty()) {
            throw new MedicalRecordVerificationException("Medication condition is missing");
        }


        return true; 
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getChildID() {
        return childID;
    }

    public void setChildID(String childID) {
        this.childID = childID;
    }

    public String getMedicationCondition() {
        return medicationCondition;
    }

    public void setMedicationCondition(String medicationCondition) {
        this.medicationCondition = medicationCondition;
    }
}

class MedicalRecordVerificationException extends Exception {
    public MedicalRecordVerificationException(String message) {
        super(message);
    }
}
