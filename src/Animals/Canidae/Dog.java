package Animals.Canidae;

import Animals.Animal;
import Organism.Carnivore;

public class Dog extends Animal implements Carnivore {
    public Dog(int weight, String species, String habitat, String diet) {
        super(weight, species, habitat, diet);
    }

    public void bark() {
        System.out.println("The dog barks!");
    }

    @Override
    public void eatAnimal() {
        System.out.println("The dog eats meat.");
    }

    @Override
    public void hunt() {
        System.out.println("The dog hunts in packs.");
    }

    @Override
    public void stalk() {
        System.out.println("The dog stalks its prey.");
    }
}
