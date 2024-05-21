public class MainProgram implements TrainingProgram{

    private String exercises;

    public MainProgram() {
    }

    public String getExercises() {
        return exercises;
    }

    public void setExercises(String exercises) {
        this.exercises = exercises;
    }

    @Override
    public void create() {
        System.out.println("Creating a main fitness program");
    }

    @Override
    public String programDescription() {
        return "The main program";
    }

}
