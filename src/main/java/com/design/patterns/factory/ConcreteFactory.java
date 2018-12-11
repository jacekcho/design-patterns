package com.design.patterns.factory;

public class ConcreteFactory extends AnimalFactory {

    @Override
    public Animal getAnimalType(String type) throws Exception {
        switch (type) {
            case "Duck":
                return new Duck();
            case "Tiger":
                return new Tiger();
            default:
                throw new Exception("Animal type : " + type + " cannot be instantiated");
        }
    }
}