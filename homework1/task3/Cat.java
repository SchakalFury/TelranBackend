package homework1.task3;

public class Cat extends Animal{

    @Override
    public String makeNoise() {
        return "cat meows";
    }

    @Override
    public String eat() {
        return "- has everything, but loves valerian more";
    }

    @Override
    public String getDescription() {
        return "- The emperor of the whole apartment, purrs, leads a nocturnal lifestyle. A pet.";
    }

    @Override
    public String getName() {
        return "Cat";
    }
}
