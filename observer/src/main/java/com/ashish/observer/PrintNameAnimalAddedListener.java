package com.ashish.observer;

public class PrintNameAnimalAddedListener implements AnimalAddedListener {
	
	@Override
	public void updateAnimalAdded(Animal animal) {
		System.out.println(this.getClass() + " - Added a new animal with name '" + animal.getName() + "'");
	}
}