package Animals.Elephantidae;

import Animals.Animal;
import Organism.Herbivore;

public class Elephant extends Animal implements Herbivore {
    public Elephant(int weight, String species, String habitat, String diet) {
        super(weight, species, habitat, diet);
    }

    public void trumpet() {
        System.out.println("The elephant trumpets!");
    }


    @Override
    public void eatGrass() {
        System.out.println("The elephant eats grass.");
    }

    @Override
    public void graze() {
        System.out.println("The elephant grazes on grass.");
    }

    @Override
    public void chew() {
        System.out.println("The elephant chews its food.");
    }

    @Override
    public void digest() {
        System.out.println("The elephant digests its food.");
    }

    @Override
    public void ruminate() {
        System.out.println("The elephant ruminates its food.");
    }
}
