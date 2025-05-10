package Animals;

public class Animal {
    private int weight;
    private String species;
    private String habitat;
    private String diet;

    public Animal(int weight, String species, String habitat, String diet) {
        this.weight = weight;
        this.species = species;
        this.habitat = habitat;
        this.diet = diet;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }
}
