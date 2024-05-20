public class CardioTraining extends TrainingProgramDecorator{
    private String running;

    public CardioTraining(TrainingProgram decorate, String running) {
        super(decorate);
        this.running = running;
    }

    @Override
    public void create() {
        super.create();
        this.addCardio();
    }

    @Override
    public String programDescription() {
        return "Cardio is added to program";
    }

    private void addCardio(){
        System.out.println("Add a cardio exercise: " + this.running);
    }
}
