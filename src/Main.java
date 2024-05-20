public class Main {
    public static void main(String[] args) {
        Fitness fitness = Fitness.getInstance();

        FitnessInstructor instructor = new FitnessInstructor("Ivan");
        FitnessInstructor instructor1 = new FitnessInstructor("Peter");

        Person exerciser1 = new Person("Georgi");
        Person exerciser2 = new Person("Maria");
        Person exerciser3 = new Person("Petya");

        TrainingProgram program1 = new MainProgram();
        TrainingProgram program2 = new Program();

        instructor.subscribe(exerciser1);
        instructor.subscribe(exerciser3);
        instructor.setTrainingProgram(program1);

        instructor1.subscribe(exerciser2);
        instructor1.setTrainingProgram(program2);

        TrainingProgram program3 = new StrengthTraining(program1,20);
        TrainingProgram program4 = new CardioTraining(program2, "5km");

        exerciser1.update(program3);
        exerciser2.update(program4);
        instructor.unsubscribe(exerciser3);

    }
}
