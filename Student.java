import java.util.Date;

public class Student {
    private String studentId;
    private String name;
    private String faculty;
    private int year;

    private String membershipType;
    private Date membershipExpireDate;
    private boolean isActive;
    private int totalVisit;

    public Student(String studentId, String name, String faculty, int year) {
        this.studentId = studentId;
        this.name = name;
        this.faculty = faculty;
        this.year = year;
        this.membershipType = "FREE";
        this.isActive = true;
        this.totalVisit = 0;
    }

    public boolean checkMembershipStatus() {
        Date today = new Date();
        return isActive && membershipExpireDate != null && membershipExpireDate.after(today);
    }

    public void checkIn() {
        if (checkMembershipStatus()) {
            totalVisit++;
            System.out.println(name + " checked in to the gym.");
        } else {
            System.out.println("Membership expired or inactive.");
        }
    }

    public void checkOut() {
        System.out.println(name + " checked out from the gym.");
    }

    public void renewMembership(Date newExpireDate) {
        this.membershipExpireDate = newExpireDate;
        this.isActive = true;
        System.out.println("Membership renewed successfully.");
    }

    public String getStudentInfo() {
        return "Student ID: " + studentId +
                "Name: " + name +
                "Faculty: " + faculty +
                "Year: " + year +
                "Membership: " + membershipType +
                "Total Visit: " + totalVisit;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getTotalVisit() {
        return totalVisit;
    }
}