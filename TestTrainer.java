public class TestTrainer {

    public static void main(String[] args) {


        Trainer trainer1 = new Trainer();
        System.out.println("Trainer 1 available: " + trainer1.checkAvailability());



        Trainer trainer2 = new Trainer("T001", "Alex", "Yoga", 5);
        System.out.println(trainer2.getTrainerInfo());
        System.out.println("Trainer 2 available: " + trainer2.checkAvailability());



        trainer2.assignClass();
        System.out.println("Trainer 2 available after assign: " + trainer2.checkAvailability());



        trainer2.finishClass();
        System.out.println("Trainer 2 available after finish: " + trainer2.checkAvailability());




        System.out.println(trainer2.getTrainerInfo());
    }
}