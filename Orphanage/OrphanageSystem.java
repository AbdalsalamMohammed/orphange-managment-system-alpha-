package Orphanage;

import java.util.ArrayList;
import java.util.List;

public class OrphanageSystem {
    private List<Orphanage> orphanages;
    private List<Donor> donors;

    public OrphanageSystem() {
        this.orphanages = new ArrayList<>();
        this.donors = new ArrayList<>();
    }

    public void addOrphanage(Orphanage orphanage) {
        orphanages.add(orphanage);
    }

    public List<Orphanage> getOrphanages() {
        return orphanages;
    }

    public void addDonor(Donor donor) {
        donors.add(donor);
    }

    public List<Donor> getDonors() {
        return donors;
    }


    public static void main(String[] args) {
        OrphanageSystem orphanageSystem = new OrphanageSystem();

        Orphanage orphanage = new Orphanage("1", "Sunshine Orphanage", "City Center", "John Doe", 50);
        orphanageSystem.addOrphanage(orphanage);

        Donor donor = new Donor("Alice", "Smith", 'F', "1234567890", "alice@example.com", "2000-01-01", "1", "2024-05-01");
        orphanageSystem.addDonor(donor);


        List<Orphanage> orphanages = orphanageSystem.getOrphanages();
        List<Donor> donors = orphanageSystem.getDonors();

    }
}
