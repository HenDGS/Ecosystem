package Animals.Felidae;

import Animals.Animal;
import Organism.Carnivore;

public class Tiger extends Animal implements Carnivore {
    public Tiger(int weight, String species, String habitat, String diet) {
        super(weight, species, habitat, diet);
    }

    public void roar() {
        System.out.println("The tiger roars!");
    }

    @Override
    public void eatAnimal() {
        System.out.println("The tiger eats meat.");
    }

    @Override
    public void hunt() {
        System.out.println("The tiger hunts alone.");
    }

    @Override
    public void stalk() {
        System.out.println("The tiger stalks its prey.");
    }
}
