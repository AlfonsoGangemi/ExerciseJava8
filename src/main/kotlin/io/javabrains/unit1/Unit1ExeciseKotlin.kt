package io.javabrains.unit1

import io.javabrains.TeamFactory
import io.javabrains.Person
import io.javabrains.TeamFactoryKt
import io.javabrains.PersonKt

fun main(args: Array<String>) {
	val team = TeamFactoryKt.getTeam()
	//1
	val orderedTeam = team.sortedBy { it.lastName }
	//2
	printAll(orderedTeam, { true })
	//3
	printAll(orderedTeam, { p -> p.lastName.startsWith("S") })

}

fun <T> printAll(team: List<T>, f: (T) -> Boolean) {
	team.filter(f).forEach { println(it) }
}
