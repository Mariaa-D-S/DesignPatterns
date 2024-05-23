public class Person implements Observer{
    private String name;
    private Observable instructor;
    private TrainingProgram trainingProgram;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void update(TrainingProgram trainingProgram) {
        this.trainingProgram = trainingProgram;
        System.out.println(name + " new training program : " + trainingProgram.programDescription());
    }

    @Override
    public void setTrainer(Observable trainer) {
        this.instructor = trainer;
    }

    public void setTrainingStrategy(TrainingStrategy trainingStrategy){
        trainingStrategy.train();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
