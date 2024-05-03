package Orphanage;

class Orphanage {
    private String orphanageID;
    private String name;
    private String location;
    private String owner;
    private int capacity;

    
    public Orphanage(String orphanageID, String name, String location, String owner, int capacity) {
        this.orphanageID = orphanageID;
        this.name = name;
        this.location = location;
        this.owner = owner;
        this.capacity = capacity;
    }

    
    public String getOrphanageID() {
        return orphanageID;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getOwner() {
        return owner;
    }

    public int getCapacity() {
        return capacity;
    }

    // Setters
    public void setOrphanageID(String orphanageID) {
        this.orphanageID = orphanageID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
