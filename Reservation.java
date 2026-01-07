public class Reservation {
    private int reservationId;
    private String reservationDate;
    private String status;

    public static String gymName = "Smart Fitness Gym";

    public Reservation() {
        this.reservationId = 0;
        this.reservationDate = "Unknown";
        this.status = "Pending";
    }

    public Reservation(int reservationId, String reservationDate, String status) {
        this.reservationId = reservationId;
        this.reservationDate = reservationDate;
        this.status = status;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}