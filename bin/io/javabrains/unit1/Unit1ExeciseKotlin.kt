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
	orderedTeam.forEach { println(it) }
	//3
	orderedTeam.filter { it.lastName.startsWith("S") }.forEach { println(it) }
}
