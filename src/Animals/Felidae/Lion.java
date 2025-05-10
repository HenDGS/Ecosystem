package Animals.Felidae;

import Animals.Animal;
import Organism.Carnivore;

public class Lion extends Animal implements Carnivore {
    public Lion(int weight, String species, String habitat, String diet) {
        super(weight, species, habitat, diet);
    }

    public void roar() {
        System.out.println("The lion roars!");
    }

    @Override
    public void eatAnimal() {
        System.out.println("The lion eats meat.");
    }

    @Override
    public void hunt() {
        System.out.println("The lion hunts in prides.");
    }

    @Override
    public void stalk() {
        System.out.println("The lion stalks its prey.");
    }
}
