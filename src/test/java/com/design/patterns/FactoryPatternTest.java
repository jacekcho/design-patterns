package com.design.patterns;

import com.design.patterns.factory.Animal;
import com.design.patterns.factory.AnimalFactory;
import com.design.patterns.factory.ConcreteFactory;
import org.junit.Test;

public class FactoryPatternTest {

    @Test
    public void shouldCreateObjectDuck() throws Exception {
        // given
        AnimalFactory animalFactory = new ConcreteFactory();

        // when
        Animal duckType = animalFactory.getAnimalType("Duck");

        // then
        duckType.speak();
    }

    @Test
    public void shouldCreateObjectTiger() throws Exception {
        // given
        AnimalFactory animalFactory = new ConcreteFactory();

        // when
        Animal tigerType = animalFactory.getAnimalType("Tiger");

        // then
        tigerType.speak();
    }

    @Test(expected = Exception.class)
    public void shouldCreateNonExistingObject() throws Exception {
        // given
        AnimalFactory animalFactory = new ConcreteFactory();

        // when
        Animal lionType = animalFactory.getAnimalType("Lion");

        // then
        lionType.speak();
    }

}
