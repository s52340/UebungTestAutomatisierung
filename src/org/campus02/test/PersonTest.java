package org.campus02.test;

import org.campus02.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person;

    @BeforeEach
    void setUp(){
        person = new Person("Max", "Muster", 'M', 22, "AUT", 2000, "blau", 80, 180);
    }
    @Test
    void testConstructor() {
        Assertions.assertEquals("Max", person.getFirstname());
        Assertions.assertEquals("Muster", person.getLastname());
        Assertions.assertEquals("blau", person.getEyeColor());
        Assertions.assertEquals('M',person.getGender());

    }
    @Test
    void setEyeColor() {

    }
}