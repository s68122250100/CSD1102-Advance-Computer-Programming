public class Trainer {

    private String trainerId;
    private String name;
    private String specialty;
    private int experienceYear;
    private boolean isAvailable;
    private int totalClass;


    public Trainer() {
        this.isAvailable = false;
        this.totalClass = 0;
    }


    public Trainer(String trainerId, String name, String specialty, int experienceYear) {
        this.trainerId = trainerId;
        this.name = name;
        this.specialty = specialty;
        this.experienceYear = experienceYear;
        this.isAvailable = true;
        this.totalClass = 0;
    }

    public boolean checkAvailability() {
        return isAvailable;
    }

    public void assignClass() {
        if (isAvailable) {
            totalClass++;
            isAvailable = false;
            System.out.println(name + " has been assigned to a class.");
        } else {
            System.out.println("Trainer is not available.");
        }
    }

    public void finishClass() {
        isAvailable = true;
        System.out.println(name + " has finished the class.");
    }

    public String getTrainerInfo() {
        return "Trainer ID: " + trainerId +
               ", Name: " + name +
               ", Specialty: " + specialty +
               ", Experience: " + experienceYear + " years" +
               ", Total Classes: " + totalClass;
    }
}