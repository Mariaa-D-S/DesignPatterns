# DesignPatterns

Singleton Pattern:
Ensures that the Fitness class has only one instance throughout the application.
The Fitness class likely has a private constructor and a static method that provides access to the single instance.


Strategy Pattern:
Allows defining a family of algorithms (training strategy) and making them interchangeable.
The TrainingStrategy interface represents the strategy, and classes like Train3DaysAWeek, Train5DaysAWeek and TrainEveryDay implement this interface. These implementations encapsulate different count for training days for each person.


Decorator Pattern:
Adds responsibilities to objects dynamically.
The TrainingProgramDecorator class, which extends the TrainingProgram interface, allows for additional functionality to be added to existing training programs, such as adding specific exercises dynamically.


Observer Pattern:
Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified.
The Observable interface and FitnessInstructor class serve as the subject, while the Observer interface and Person class (exercisers) represent the observers. When the instructor updates the training program, all registered exercisers are notified of the change.
