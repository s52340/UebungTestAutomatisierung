package org.campus02;

import java.util.ArrayList;

public class PersonManager {
    private ArrayList<Person> persons = new ArrayList<>();


    //selber erstellt - required for testing (nötig für tests)
    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void addPerson(Person p) {
        //this.persons.add(p);
        persons.add(p);
    }

    public void doAnalysis(PersonAnalyzer a) {
        //a.setPersons(this.persons);
        a.setPersons(persons);
        a.analyze();
    }

}
