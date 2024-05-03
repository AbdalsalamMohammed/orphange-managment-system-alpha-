package Orphanage;

class Staff extends Person {
    private String id;
    private String salary;
    private String role;
    private String supervisor;

    public Staff(String firstName, String lastName, char gender, String phoneNumber, String email, String dateOfBirth, String id, String salary, String role, String supervisor) {
        super(firstName, lastName, gender, phoneNumber, email, dateOfBirth);
        this.id = id;
        this.salary = salary;
        this.role = role;
        this.supervisor = supervisor;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
}