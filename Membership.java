public class Membership {
    private String Memid;
    private String Memname;
    private String Memrank;
    public static int Memcount = 0;

    public Membership() {
        Memcount++;
    }

    public Membership(String Memid) {
        this.Memid = Memid;
        Memcount++;
    }

    public Membership(String Memid, String Memname) {
        this.Memid = Memid;
        this.Memname = Memname;
        Memcount++;
    }

    public Membership(String Memid, String Memname, String Memrank) {
        this.Memid = Memid;
        this.Memname = Memname;
        this.Memrank = Memrank;
        Memcount++;
    }

    public String getMemid() {
        return Memid;
    }

    public void setMemid(String Memid) {
        this.Memid = Memid;
    }

    public String getMemname() {
        return Memname;
    }

    public void setMemname(String Memname) {
        this.Memname = Memname;
    }

    public String getMemrank() {
        return Memrank;
    }

    public void setMemrank(String Memrank) {
        this.Memrank = Memrank;
    }

    public void printMembership() {
        System.out.println("Print Membership id : " + this.Memid);
    }

    public void printMembership(String text) {
        System.out.println("Print Membership Overloading" + text);
    }
}