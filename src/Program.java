public class Program implements TrainingProgram{

    @Override
    public void create() {
        System.out.println("A personal program is created");
    }

    @Override
    public String programDescription() {
        return "This is a personal program";
    }
}
