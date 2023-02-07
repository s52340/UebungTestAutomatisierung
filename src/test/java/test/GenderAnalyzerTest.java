package org.campus02.test;

import org.campus02.GenderAnalyzer;
import org.campus02.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GenderAnalyzerTest {

    Person person1;
    Person person2;
    Person person3;

    ArrayList<Person> persons = new ArrayList<>();

    @BeforeEach
    void setup (){
        person1 = new Person("Max", "Muster", 'M', 22, "AUT", 2000, "blau", 80, 180);
        person2 = new Person("Susi", "Sorglos", 'W', 25, "AUT", 4000, "gelb", 70, 170);
        person3 = new Person("Marie", "Sorglos", 'W', 25, "AUT", 3000, "gelb", 60, 150);

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
    }

    /**
     * Test the result of avgM and avgW
     */

    @Test
    void analyze() {

        GenderAnalyzer genderAnalyzer = new GenderAnalyzer();
        genderAnalyzer.setPersons(persons);
        genderAnalyzer.analyze();

        // das möchte ich Testen: genderAnalyzer.getAvgM(); siehe Zeile unterhalb

        Assertions.assertEquals(180, genderAnalyzer.getAvgM());  // ich teste durchschnittsgröße der Männer (habe nur einen)

        Assertions.assertEquals(160,genderAnalyzer.getAvgW());  // ich Teste durchschnittsgröße der Frauen


    }

    @Test
    void analyzeEmpty() {
        GenderAnalyzer genderAnalyzer = new GenderAnalyzer();
        genderAnalyzer.analyze();

        Assertions.assertEquals(0, genderAnalyzer.getAvgM());
        Assertions.assertEquals(0, genderAnalyzer.getAvgM());
    }
}