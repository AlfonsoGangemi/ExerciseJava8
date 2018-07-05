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
	printCondition(team, { true })
	//3
	performCondition(team, { it.lastName.startsWith("S") }, { println("${it.lastName} ${it.firstName}") })

}

fun <T> printCondition(team: List<T>, condition: (T) -> Boolean) = performCondition(team, condition, { println(it) })

fun <T> performCondition(team: List<T>, condition: (T) -> Boolean, action: (T) -> Unit) = team.filter(condition).forEach(action)
