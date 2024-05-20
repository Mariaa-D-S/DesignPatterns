public class StrengthTraining extends TrainingProgramDecorator{
    private int weight;

    public StrengthTraining(TrainingProgram decorate, int weight) {
        super(decorate);
        this.weight = weight;
    }

    @Override
    public void create() {
        super.create();
        this.addStrength();
    }

    @Override
    public String programDescription() {
        return "Weights are added to program";
    }

    private void addStrength(){
        System.out.println("Add a strength exercise: " + this.weight);
    }
}
