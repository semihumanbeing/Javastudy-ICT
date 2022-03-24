package mymain;

import myutil.Animal;
import myutil.Cat;
import myutil.Dog;
import myutil.Pig;

public class MyAnimals {

	private static void animalCries(Animal[] animalArray) {
		
		for (int i=0; i<animalArray.length;i++) {
			Animal animal = animalArray[i];
			animal.cry();
		}
		

	}
	private static void animalEats(Animal[] animalArray) {
		for (int i=0; i<animalArray.length;i++) {
			Animal animal = animalArray[i];
			animal.eat();
		}

	}

	public static void main(String[] args) {

		Animal[] animalArray = { new Dog(), new Cat(), new Pig() };

		animalCries(animalArray);
		System.out.println();
		animalEats(animalArray);

	}

}
