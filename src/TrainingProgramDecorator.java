public abstract class TrainingProgramDecorator implements TrainingProgram{
    protected TrainingProgram decorate;

    public TrainingProgramDecorator(TrainingProgram decorate) {
        super();
        this.decorate = decorate;
    }

    @Override
    public void create() {
        this.decorate.create();
    }
}
