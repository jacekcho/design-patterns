package com.design.patterns.factory;

public abstract class AnimalFactory {

    public abstract Animal getAnimalType(String type) throws Exception;

}
