package io.javabrains.unit1;

import java.util.Collections;
import java.util.List;

import io.javabrains.Person;
import io.javabrains.TeamFactory;

public class Unit1ExeciseJava8 {

    public static void main(String[] args) {
	List<Person> team = TeamFactory.getTeam();

	Collections.sort(team, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

	printWithFilter(team, p -> true);
	printWithFilter(team, item -> item.getLastName().startsWith("S"));
    }

    private static void printWithFilter(List<Person> team, Filter<Person> filter) {
	for (Person person : team) {
	    if (filter.pass(person)) {
		System.out.println(person);
	    }
	}
    }

}
