package io.javabrains.unit1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import io.javabrains.Person;
import io.javabrains.TeamFactory;

public class Unit1ExeciseJava7 {

    public static void main(String[] args) {
	List<Person> team = TeamFactory.getTeam();

	Collections.sort(team, new Comparator<Person>() {
	    @Override
	    public int compare(Person p1, Person p2) {
		return p1.getLastName().compareTo(p2.getLastName());
	    }
	});

	printAll(team);
	printWithFilter(team, new Filter<Person>() {
	    @Override
	    public boolean pass(Person item) {
		return item.getLastName().startsWith("S");
	    }
	});
    }

    private static void printWithFilter(List<Person> team, Filter<Person> filter) {
	for (Person person : team) {
	    if (filter.pass(person)) {
		System.out.println(person);
	    }
	}
    }

    private static void printAll(List<Person> team) {
	for (Person person : team) {
	    System.out.println(person);
	}
    }

}

interface Filter<T> {
    boolean pass(T item);
}
