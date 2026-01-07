// คลาส Equipment แทนอุปกรณ์ในฟิตเนส
public class Equipment {

    // private instance variable
    private String id;
    private String name;
    private String status;

    // public static variable
    public static int count = 0;

    // Constructor 1
    public Equipment(String name) {
        this.name = name;
        this.status = "Ready";
        count++;
    }

    // Constructor 2
    public Equipment(String id, String name) {
        this.id = id;
        this.name = name;
        this.status = "Ready";
        count++;
    }

    // get/set
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    // method
    public String checkStatus() {
        return "status: " + status;
    }
}
