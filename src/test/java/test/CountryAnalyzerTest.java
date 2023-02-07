package org.campus02.test;

import org.campus02.CountryAnalyzer;
import org.campus02.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CountryAnalyzerTest {

    Person person1;
    Person person2;
    Person person3;

    ArrayList<Person> personArrayList = new ArrayList<>();
    @BeforeEach
    void setup() {
        person1 = new Person("Max", "Muster", 'M', 22, "AUT", 2000, "blau", 80, 180);
        person2 = new Person("Susi", "Sorglos", 'W', 25, "AUT", 4000, "gelb", 70, 170);
        person3 = new Person("Marie", "Sorglos", 'W', 25, "AUT", 3000, "gelb", 60, 150);

        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(person3);
    }

    /**
     * check result
     */


    @Test
    void analyze() {
        CountryAnalyzer countryAnalyzer = new CountryAnalyzer();
        countryAnalyzer.setPersons(personArrayList);
        countryAnalyzer.analyze();

        //.getResult - ich bekomme die ganze Hashmap nocheinmal.get -Ich bekomme wirklich ergenbis von country
        Assertions.assertEquals(3, countryAnalyzer.getResult().get("AUT"));

    }
}