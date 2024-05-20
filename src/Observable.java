public interface Observable {
    //Coach
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObserver();
    TrainingProgram getUpdate();
}
