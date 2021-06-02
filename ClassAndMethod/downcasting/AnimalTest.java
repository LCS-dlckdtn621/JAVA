package downcasting;

import polymorphism.Animal;
import polymorphism.Eagle;
import polymorphism.Human;
import polymorphism.Tiger;

import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args){
        polymorphism.Animal hAnimal = new Human();
        polymorphism.Animal tAnimal = new Tiger();
        polymorphism.Animal eAnimal = new Eagle();
        //다형성에 해당!

        ArrayList<polymorphism.Animal> animalList = new ArrayList<>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        AnimalTest test = new AnimalTest();
        for(polymorphism.Animal animal : animalList){
            test.moveAnimal(animal);
        }

        Tiger tiger = (Tiger)tAnimal;
        //downcasting으로 형변환 하고 새로 선언하는 것
        if(tiger instanceof Tiger){
            //보험 코드
            tiger.hunt();
        }

        for(polymorphism.Animal animal : animalList){
            if(animal instanceof Eagle){
                Eagle eagle = (Eagle)animal;
                eagle.flying();
            }
        }
    }

    public void moveAnimal(Animal animal){
        animal.move();
    }

}
