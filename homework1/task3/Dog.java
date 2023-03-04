package homework1.task3;

public class Dog extends Animal{

    @Override
    public String makeNoise() {
        return "dog barking";
    }

    @Override
    public String eat() {
        return "- eats everything, but prefers meat";
    }

    @Override
    public String getDescription() {
        return "- Four lares, the tail looks like a wolf. A pet";
    }

    @Override
    public String getName() {
        return "Dog";
    }
}
