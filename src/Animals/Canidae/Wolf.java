package Animals.Canidae;

import Animals.Animal;
import Organism.Carnivore;

public class Wolf extends Animal implements Carnivore {

    public Wolf(int weight, String species, String habitat, String diet) {
        super(weight, species, habitat, diet);
    }

    public void howl() {
        System.out.println("The wolf howls!");
    }

    @Override
    public void eatAnimal() {
        System.out.println("The wolf eats meat.");

    }

    @Override
    public void hunt() {
        System.out.println("The wolf hunts in packs.");
    }

    @Override
    public void stalk() {
        System.out.println("The wolf stalks its prey.");
    }
}
