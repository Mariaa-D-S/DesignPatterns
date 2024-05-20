public class Fitness {
    private static Fitness instance;
    private Fitness(){}

    public static Fitness getInstance(){
        if(instance == null){
            instance = new Fitness();
        }
        System.out.println("Welcome to the Gym!");
        return instance;
    }
}
