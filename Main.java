public class Main {
    public static void main(String[] args) {

        // ! Student
        Student s1 = new Student("65123456", "Chotipan", null, 0);

        if (s1.checkMembershipStatus()) {
            System.out.println("สมาชิกยังใช้งานได้");
            s1.checkIn();
        } else {
            System.out.println("สมาชิกหมดอายุ");
        }

        // ! Trainer
        Trainer trainer1 = new Trainer();
        System.out.println("Trainer 1 available: " + trainer1.checkAvailability());

        Trainer trainer2 = new Trainer("T001", "Alex", "Yoga", 5);
        System.out.println(trainer2.getTrainerInfo());

        // fn Trainer
        trainer2.assignClass();
        System.out.println("Trainer 2 available after assign: " + trainer2.checkAvailability());

        trainer2.finishClass();
        System.out.println("Trainer 2 available after finish: " + trainer2.checkAvailability());

        // ! Membership
        Membership m1 = new Membership();
        Membership m2 = new Membership("M001");
        Membership m3 = new Membership("M002", "Alice");
        Membership m4 = new Membership("M003", "Bob", "Diamond");
        m1.printMembership();
        m2.printMembership();
        m3.printMembership(" From m3");
        m4.printMembership(" From m4");

        // ! Reservation
        Reservation r1 = new Reservation();
        Reservation r2 = new Reservation(1001, "2026-01-08", "Confirmed");

        System.out.println(r1.getStatus());
        System.out.println(r2.getReservationDate());

        // ! FitnessClass
        FitnessClass c1 = new FitnessClass("Yoga", "Mon 09:00");
        c1.setClassId("C001");
        System.out.println(c1.getClassName());
        System.out.println(c1.getSchedule());

        FitnessClass c2 = new FitnessClass("C002", "Boxing", "Tue 17:00");
        c2.setSchedule("Wed 18:00");
        System.out.println(c2.getClassName());
        System.out.println(c2.checkDetails());

        // ! Equipment

        Equipment e1 = new Equipment("Weight");
        System.out.println(e1.getName());

        Equipment e2 = new Equipment("001", "dumbell");
        System.out.println(e2.getName());

        // ! Gymstaff
        Gymstaff staff1 = new Gymstaff("Somchai", "Trainer");
        staff1.setStaffID("ST001");

        Gymstaff staff2 = new Gymstaff("ST002", "Maree", "Manager");

        System.out.println("Checking Status:");
        System.out.println(staff1.checkWorkStatus());
        System.out.println(staff2.checkWorkStatus());

        System.out.println("Update: Maree goes on leave...");
        staff2.setStatus("On Leave");
        System.out.println(staff2.checkWorkStatus());

        System.out.println("Current Total Staff: " + Gymstaff.staffCount);

    }
}
