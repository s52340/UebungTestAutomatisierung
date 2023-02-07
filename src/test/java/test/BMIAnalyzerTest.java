package org.campus02.test;

import org.campus02.BMIAnalyzer;
import org.campus02.Pair;
import org.campus02.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BMIAnalyzerTest {
    Person person1;
    Person person2;
    Person person3;

    ArrayList<Person> personArrayList = new ArrayList<>();

    double person1_bmi = 24.69135802469136; // selber berechnet
    double person3_bmi = 26.666666666666668; //selber berechnet

    @BeforeEach
    void setup(){
        person1 = new Person("Max", "Muster", 'M', 22, "AUT", 2000, "blau", 80, 180);
        person2 = new Person("Susi", "Sorglos", 'W', 25, "AUT", 4000, "gelb", 70, 170);
        person3 = new Person("Marie", "Sorglos", 'W', 25, "AUT", 3000, "gelb", 60, 150);

        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(person3);

    }

    @Test
    void calcBmi() {
        BMIAnalyzer bmiAnalyzer = new BMIAnalyzer();


        Assertions.assertEquals(person1_bmi, bmiAnalyzer.calcBmi(person1));
        }

    /**
     * check result
     */
    @Test
    void analyze() {
        BMIAnalyzer bmiAnalyzer = new BMIAnalyzer();
        bmiAnalyzer.setPersons(personArrayList);
        bmiAnalyzer.analyze();

        ArrayList<Pair<Person, Double>> personUndBmiArrayList = bmiAnalyzer.getResult();

        // .get(0) = erster Eintrag in ArrayList .getKey - um auf die Person zugreifen zu können von Pair
        personUndBmiArrayList.get(0).getKey();
        Assertions.assertEquals(person1,personUndBmiArrayList.get(0).getKey());

        Assertions.assertEquals(person1_bmi, personUndBmiArrayList.get(0).getValue());

        //Test für person3
        Assertions.assertEquals(person3,personUndBmiArrayList.get(2).getKey());
        Assertions.assertEquals(person3_bmi, personUndBmiArrayList.get(2).getValue());

    }
}