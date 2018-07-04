package io.javabrains.unit1

import io.javabrains.TeamFactory
import io.javabrains.Person
import io.javabrains.TeamFactoryKt
import io.javabrains.PersonKt

fun main(args: Array<String>) {
	var team = TeamFactoryKt.getTeam()
	//1
	team.sortBy { it.lastName }
	//2
	printAll(team, { true })
	//3
	printAll(team, { it.lastName.startsWith("S") })

}

fun <T> printAll(team: List<T>, condition: (T) -> Boolean) {
	team.filter(condition).forEach { println(it) }
}
