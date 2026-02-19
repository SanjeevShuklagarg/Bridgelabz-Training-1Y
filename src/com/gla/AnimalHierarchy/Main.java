package com.gla.AnimalHierarchy;

class Main{
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Tommy", 3),
                new Cat("Kitty", 2),
                new Bird("Tweety", 1)
        };

        for (Animal a : animals) {
            a.makeSound();
        }
    }
}
