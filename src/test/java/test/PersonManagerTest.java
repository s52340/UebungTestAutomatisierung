package org.campus02.test;

import org.campus02.GenderAnalyzer;
import org.campus02.Person;
import org.campus02.PersonManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PersonManagerTest {

    //besser @beforeEach und Personen hinzufügen
    @Test
    void addPerson() {

        Person personOne = new Person("Alina","Thaler", 'W', 23, "AUT",1200, "Blau", 50, 160);
        Person personTwo = new Person("Verena","Thaler", 'W', 23, "AUT",1200, "Blau", 22, 300);
        Person personThree = new Person("Nadine","Jansenberger", 'W', 23, "AUT",1200, "Blau", 50, 160);
        Person personFour = new Person("Daniel","Jansenberger", 'W', 23, "AUT",1200, "Blau", 50, 160);

        PersonManager personManager = new PersonManager();
        personManager.addPerson(personOne);
        personManager.addPerson(personTwo);

        Assertions.assertEquals(2, personManager.getPersons().size());

        personManager.addPerson(personThree);
        personManager.addPerson(personFour);
        personManager.addPerson(personOne);
        Assertions.assertEquals(5,personManager.getPersons().size());

        ArrayList<Person> arrayListPerson = personManager.getPersons();


        Assertions.assertEquals(personOne, arrayListPerson.get(0));
        Assertions.assertEquals(personTwo, arrayListPerson.get(1));
        Assertions.assertEquals(personThree, arrayListPerson.get(2));
        Assertions.assertEquals(personFour, arrayListPerson.get(3));
        Assertions.assertEquals(personOne, arrayListPerson.get(4));
    }


    @Test
    void doAnalysis(){
        Person personOne = new Person("Alina","Thaler", 'W', 23, "AUT",1200, "Blau", 50, 160);
        Person personTwo = new Person("Verena","Thaler", 'W', 23, "AUT",1200, "Blau", 22, 180);
        Person personThree = new Person("Nadine","Jansenberger", 'W', 23, "AUT",1200, "Blau", 50, 170);
        Person personFour = new Person("Sonja","Jansenberger", 'W', 23, "AUT",1200, "Blau", 50, 170);

        PersonManager personManager = new PersonManager();
        personManager.addPerson(personOne);
        personManager.addPerson(personTwo);
        personManager.addPerson(personThree);
        personManager.addPerson(personFour);


        GenderAnalyzer genderAnalyzer = new GenderAnalyzer();
        personManager.doAnalysis(genderAnalyzer);

        Assertions.assertEquals(170, genderAnalyzer.getAvgW());
        Assertions.assertEquals(0, genderAnalyzer.getAvgM());
    }
}