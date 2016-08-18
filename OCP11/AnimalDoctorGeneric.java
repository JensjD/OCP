import java.util.*;

public class AnimalDoctorGeneric{
    public void addAnimal(List<? super Animal> animals){
        animals.add(new Dog());
        //for(Animal a:animals)
          //  System.out.println(a);
        System.out.println("Aasdf");
    }
    public static void main(String[] args){
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Dog());
        AnimalDoctorGeneric doc = new AnimalDoctorGeneric();
        doc.addAnimal(animals);
        for(Animal a:animals){
            System.out.println(a);
        }

    }
}

class Animal{}
class Cat extends Animal{
    public String toString(){
        return "Cat";
    }
}
class Dog extends Animal{
    public String toString(){
        return "Dog";
    }
}
