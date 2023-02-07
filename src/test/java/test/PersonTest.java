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
        Assertions.assertEquals("blau",person.getEyeColor());

        person.setEyeColor("grün");
        Assertions.assertEquals("grün",person.getEyeColor());

        person.setEyeColor("rot");
        Assertions.assertEquals("undefined",person.getEyeColor());
    }

    @Test
    void equalsOperator() {
        Assertions.assertEquals("blau",person.getEyeColor());   // funktioniert weil er before each erneut aufruft vor dieser Testklasse;

        Person person2_equal = new Person("Max", "Muster", 'M', 22, "AUT", 2000, "blau", 80, 180);
        Assertions.assertEquals(person, person2_equal);  // 1) existiert und funktioniert der equal operator aus der Personen Klasse; 2)besitzen die beiden Personen die gleichen Werte,

        Person person2_not_equal = new Person("Max", "Muster", 'M', 23, "AUT", 2000, "blau", 80, 180);
        Assertions.assertNotEquals(person, person2_not_equal);  // wir testen nur einen einzigen unterschied, sollte age in equals vergessen werden/ extra entfernt werden, würde man den Fehler hier finden

        Person person3_notEqual = new Person("Alina", "Thaler", 'W', 23, "AUT", 1500, "grün", 50, 150);
        Assertions.assertNotEquals(person, person3_notEqual);
    }
}