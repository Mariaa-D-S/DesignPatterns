# DesignPatterns

Singleton Pattern:
Ensures that the MainProgram class has only one instance throughout the application.
The MainProgram class likely has a private constructor and a static method that provides access to the single instance.


Strategy Pattern:
Allows defining a family of algorithms (training programs) and making them interchangeable.
The TrainingProgram interface represents the strategy, and classes like Program and MainProgram implement this interface. These implementations encapsulate different types for training programs.


Decorator Pattern:
Adds responsibilities to objects dynamically.
The TrainingProgramDecorator class, which extends the TrainingProgram interface, allows for additional functionality to be added to existing training programs, such as adding specific exercises dynamically.


Observer Pattern:
Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified.
The Observable interface and FitnessInstructor class serve as the subject, while the Observer interface and Person class (exercisers) represent the observers. When the instructor updates the training program, all registered exercisers are notified of the change.
