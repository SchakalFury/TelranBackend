package homework1.task3;

public class TaskApplication3 {
    public static void main(String[] args) {
        Vet vet1 = new Vet();
       Animal animals[] = { new Cat(), new Dog(), new Bear()};
       for(Animal animal : animals){
           vet1.treatAnimal(animal);
       }

        for(Animal animal : animals){
            System.out.println(animal.getDescription());
            System.out.println(animal.eat());
        }
    }
}
