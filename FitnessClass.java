public class FitnessClass {

    // private instance variable
    private String classId;
    private String className;
    private String schedule;

    // public static variable
    public static int count = 0;

    // Constructor 1
    public FitnessClass(String classId, String className, String schedule) {
        this.classId = classId;
        this.className = className;
        this.schedule = schedule;
        count++;
    }

    // Constructor 2
    public FitnessClass(String className, String schedule) {
        this.className = className;
        this.schedule = schedule;
        this.classId = "-"; // กำหนดค่า default กรณีไม่ใส่ ID
        count++;
    }

    // get/set
    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }

    // method
    public String checkDetails() {
        return "Class: " + className + " (" + classId + ") | Time: " + schedule;
    }
}