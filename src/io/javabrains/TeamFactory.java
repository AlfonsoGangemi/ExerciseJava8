package io.javabrains;

import java.util.Arrays;
import java.util.List;

public class TeamFactory {

    private TeamFactory() {
    }

    public static List<Person> getTeam() {
	return Arrays.asList(Person.buildPerson("Monteverdi", "Filippo", 37),
		Person.buildPerson("Sposato", "Pier Paolo", 40), Person.buildPerson("Raimondo", "Mario", 41),
		Person.buildPerson("Stillo", "Massimo", 42), Person.buildPerson("Gangemi", "Alfonso", 38),
		Person.buildPerson("Signoretta", "Pasquale", 39), Person.buildPerson("Beltrano", "Roberto", 43));
    }

}
