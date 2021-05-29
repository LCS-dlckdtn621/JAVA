package polymorphism;

import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args){
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();
        //다형성에 해당!

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        AnimalTest test = new AnimalTest();
        for(Animal animal : animalList){
            test.moveAnimal(animal);
        }
    }

    public void moveAnimal(Animal animal){
        animal.move();
    }

}
