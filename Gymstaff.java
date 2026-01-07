public class Gymstaff {
    private String staffID;
    private String name;
    private String role;
    private String status;

    public static int staffCount = 0;

    public Gymstaff(String name, String role) {
        this.name = name;
        this.role = role;
        this.status = "Active";
        staffCount++;
    }

    public Gymstaff(String staffID, String name, String role) {
        this.staffID = staffID;
        this.name = name;
        this.role = role;
        this.status = "Active";
        staffCount++;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public String checkWorkStatus() {
        return name + " is currently " + status + " as a " + role;
    }
}