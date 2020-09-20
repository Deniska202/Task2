package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Бобик", 2);
        Dog dog2 = new Dog("Tuzik", 5);

        DogNursery pit = new DogNursery();
        pit.addAllDogs(dog1, dog2);

        System.out.println(pit);
    }
}
