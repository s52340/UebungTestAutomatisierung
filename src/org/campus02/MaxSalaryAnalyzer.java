package org.campus02;

import java.util.HashSet;

public class MaxSalaryAnalyzer extends PersonAnalyzer {

    private HashSet<Person> personsWithHighestSalary = new HashSet<>();

    public HashSet<Person> getPersonsWithHighestSalary() {
        return personsWithHighestSalary;
    }

    @Override
    public void analyze() {
        int highestSalary = 0;

        for (Person person : super.getPersons()) {
            if (person.getSalary() > highestSalary) {
                personsWithHighestSalary.clear(); // zuerst leeren, da personen mit niedrigerem gehalt drinnen sein könnten;
                personsWithHighestSalary.add(person);
                highestSalary = person.getSalary();
            } else if (person.getSalary() == highestSalary) {
                personsWithHighestSalary.add(person);
            }
        }
    }
}
