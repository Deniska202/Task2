package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class DogNursery {

    private List<Dog> dogs;

    public DogNursery() {
        dogs = new ArrayList<>();
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public void addAllDogs(Dog ... dogs) {
        Collections.addAll(this.dogs, dogs);
    }

    @Override
    public String toString() {
        return "DogNursery{" +
                "dogs=" + dogs +
                '}';
    }
}
