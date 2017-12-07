package com.ashish.observer;

public class CountingAnimalAddedListener implements AnimalAddedListener {
	
	private static int animalsAddedCount = 0;

	@Override
	public void updateAnimalAdded(Animal animal) {
		
		// Increment the number of animals
		animalsAddedCount++;
	
		// Print the number of animals
		System.out.println( this.getClass() + " - Total animals added: " + animalsAddedCount);
	}
}