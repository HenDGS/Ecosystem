public class Main {
    public static void main(String[] args) {
        // Test Dog class
        Animals.Canidae.Dog dog = new Animals.Canidae.Dog(30, "Dog", "Domestic", "Carnivore");
        dog.bark();

        // Test Wolf class
        Animals.Canidae.Wolf wolf = new Animals.Canidae.Wolf(50, "Wolf", "Forest", "Carnivore");
        wolf.howl();

        // Test Lion class
        Animals.Felidae.Lion lion = new Animals.Felidae.Lion(190, "Lion", "Savannah", "Carnivore");
        lion.roar();

        // Test Tiger class
        Animals.Felidae.Tiger tiger = new Animals.Felidae.Tiger(220, "Tiger", "Jungle", "Carnivore");
        tiger.roar();

        // Create a list of carnivores
        java.util.List<Organism.Carnivore> carnivores = new java.util.ArrayList<>();
        carnivores.add(dog);
        carnivores.add(wolf);
        carnivores.add(lion);
        carnivores.add(tiger);

        // Iterate through the list and call methods
        for (Organism.Carnivore carnivore : carnivores) {
            carnivore.eatAnimal();
            carnivore.hunt();
            carnivore.stalk();
        }

        // Test the Elephant
        Animals.Elephantidae.Elephant elephant = new Animals.Elephantidae.Elephant(6000, "Elephant", "Savannah", "Herbivore");
        elephant.trumpet();
    }
}