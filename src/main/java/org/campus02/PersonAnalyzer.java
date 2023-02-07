package org.campus02;

import java.util.ArrayList;

public abstract class PersonAnalyzer {
    private ArrayList<Person> persons = new ArrayList<>();

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    // abstract erzwingt die Implementierung in den Subklassen
    public abstract void analyze();
}
