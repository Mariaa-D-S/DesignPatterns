import java.util.ArrayList;
import java.util.List;

public class FitnessInstructor implements Observable {

    private String name;
    private List<Observer> trainingPeople;
    private TrainingProgram program;

    public FitnessInstructor(String name) {
        this.name = name;
        this.trainingPeople = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void subscribe(Observer person) {
        this.trainingPeople.add(person);
        person.setTrainer(this);
    }

    @Override
    public void unsubscribe(Observer person) {
        this.trainingPeople.remove(person);
        person.setTrainer(null);
        System.out.println("Unsubscribed");
    }

    @Override
    public void notifyObserver() {
        for(Observer person : this.trainingPeople)
            person.update(program);
    }

    @Override
    public TrainingProgram getUpdate() {
        return this.program;
    }

    public void setTrainingProgram(TrainingProgram trainingProgram){
        this.program = trainingProgram;
        notifyObserver();
    }
}
