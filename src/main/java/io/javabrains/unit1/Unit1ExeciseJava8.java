package io.javabrains.unit1;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.javabrains.PersonKt;

public class Unit1ExeciseJava8 {

    public static void main(String[] args) {
	List<PersonKt> team = io.javabrains.TeamFactoryKt.INSTANCE.getTeam();
	// 1
	Collections.sort(team, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
	// 2
	printWithFilter(team, p -> true);
	// 3
	performWithFilter(team, item -> item.getLastName().startsWith("S"), System.out::println);
    }

    private static void performWithFilter(List<PersonKt> team, Predicate<PersonKt> filter,
	    Consumer<PersonKt> consumer) {
	for (PersonKt person : team) {
	    if (filter.test(person)) {
		consumer.accept(person);
	    }
	}
    }

    private static void printWithFilter(List<PersonKt> team, Predicate<PersonKt> filter) {
	performWithFilter(team, filter, System.out::println);
    }

}
