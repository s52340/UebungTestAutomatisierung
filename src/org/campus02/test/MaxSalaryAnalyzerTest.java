package org.campus02.test;

import org.campus02.MaxSalaryAnalyzer;
import org.campus02.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class MaxSalaryAnalyzerTest {

    /**
     * check personsWithHighestSalary
     */

    Person person1;
    Person person2;

    Person person3;
    // besser 3 / 4 Personen
    ArrayList<Person> persons = new ArrayList<>();

    @BeforeEach
    void setUp(){
        person1 = new Person("Max", "Muster", 'M', 22, "AUT", 2000, "blau", 80, 180);
        person2 = new Person("Susi", "Sorglos", 'W', 25, "AUT", 4000, "gelb", 60, 150);
        person3 = new Person("Marie", "Sorglos", 'W', 25, "AUT", 3000, "gelb", 60, 150);

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
    }


    @Test
    void analyze() {
        MaxSalaryAnalyzer maxSalaryAnalyzer = new MaxSalaryAnalyzer();
        maxSalaryAnalyzer.setPersons(persons);
        maxSalaryAnalyzer.analyze();

        HashSet<Person> personsWithHighestSalary = maxSalaryAnalyzer.getPersonsWithHighestSalary();
        Person personWithHighestSalary = new ArrayList<>(personsWithHighestSalary).get(0);

        Assertions.assertEquals(1, personsWithHighestSalary.size());
        Assertions.assertEquals(person2, personWithHighestSalary);
    }
}